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
		int ans = 1;
		int sign = 0;
		for(int i=0;i<n-1;i++){
			switch(sign){
			case 0:
				if(a[i]<a[i+1]){
					sign = 1;
				} else if(a[i]>a[i+1]){
					sign = -1;
				}
				break;
			case 1:
				if(a[i]>a[i+1]){
					sign=0;
					ans++;
				}
				break;
			case -1:
				if(a[i]<a[i+1]){
					sign=0;
					ans++;
				}
				break;
			}
		}
		System.out.println(ans);
	}
}