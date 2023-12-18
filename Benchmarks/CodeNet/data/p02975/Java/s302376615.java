import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		int N = sc.nextInt();
		long[] a = new long[N];
		for(int i = 0;i < N;i++) {
			a[i] = sc.nextLong();
		}
		sc.close();
		String res = "Yes";
		if((a[1]^a[N-1]) != a[0]) {
			res = "No";
		}
		for(int i = 1;i < N-1;i++) {
			if((a[i-1]^a[i+1]) != a[i]) {
				res = "No";
				break;
			}
		}
		if((a[N-2]^a[0]) != a[N-1]) {
			res = "No";
		}
		System.out.println(res);
	}
}