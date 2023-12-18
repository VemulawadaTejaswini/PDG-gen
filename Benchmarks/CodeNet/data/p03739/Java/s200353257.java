import java.util.Scanner;

class Main {
	int n;
	int[] a;

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
		int sign = (a[0]>=0)?1:-1;
		int cnt = (a[0]==0)?1:0;
		long sum = (a[0]==0)?1:a[0];
		//System.out.println(sum);
		for(int i=1;i<n;i++){
			sum += a[i];
			if(sum*sign>=0){
				cnt += Math.abs(sum) + 1;
				sum = -sign;
			}
			//System.out.println(sum);
			sign *= -1;
		}
		System.out.println(cnt);
	}
}