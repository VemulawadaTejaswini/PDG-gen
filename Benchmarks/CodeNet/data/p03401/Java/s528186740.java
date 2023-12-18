import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a[] = new int[n + 1];
		long ans = 0;
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();


		}
		a[n] = 0;
		int b[] = new int[n + 1];
		b[0] = a[0];
		for (int i = 0; i < n; i++) {
			b[i + 1] = a[i + 1] - a[i];
		}
		ans=sum(b);

for (int i = 0; i < n; i++) {
			if (b[i] * b[i + 1] < 0) {
				System.out.println(ans - Math.abs(b[i]*2) + " ");
			} else {
				System.out.println(ans + " ");
			}
		}
		System.out.println();

	}

	static void show(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println();
	}
	static int sum(int a[]){
		int n=a.length;
		int ans=0;
		for(int i=0;i<=n-1;i++){
			ans+=Math.abs(a[i]);
		}
	return ans;
		}

}