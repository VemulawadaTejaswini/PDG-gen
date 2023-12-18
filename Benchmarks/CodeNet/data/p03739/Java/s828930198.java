import java.util.Scanner;

class Main {
	int n;
	int[] a;
	long cnt1;
	long cnt2;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main m = new Main(sc);
		m.solve();
		sc.close();
	}

	Main(Scanner sc) {
		n = sc.nextInt();
		a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
	}

	void solve() {
		Thread t1 = new Thread(()->{calc_run1((a[0]>0)?0:(Math.abs(a[0])+1),1,(a[0]>0)?a[0]:1);});
		t1.start();
		Thread t2 = new Thread(()->{calc_run2((a[0]<0)?0:(Math.abs(a[0])+1),-1,(a[0]<0)?a[0]:-1);});
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Math.min(cnt1, cnt2));
	}
	
	void calc_run1(long cnt,int sign,long sum){
		for(int i=1;i<n;i++){
			sum += a[i];
			if(sum*sign>=0){
				cnt += Math.abs(sum) + 1;
				sum = -sign;
			}
			sign *= -1;
		}
		cnt1 = cnt;
		System.out.println(cnt);
	}
	
	void calc_run2(long cnt,int sign,long sum){
		for(int i=1;i<n;i++){
			sum += a[i];
			if(sum*sign>=0){
				cnt += Math.abs(sum) + 1;
				sum = -sign;
			}
			sign *= -1;
		}
		cnt2 = cnt;
		System.out.println(cnt);
	}
}
