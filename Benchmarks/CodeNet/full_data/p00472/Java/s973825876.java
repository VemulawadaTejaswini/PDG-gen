import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		for(int i=1;i<n;i++) {
			a[i] = sc.nextInt() + a[i-1];
		}
		int dist = 0;
		int k = 0;
		for(int i=0;i<m;i++) {
			int b = sc.nextInt();
			dist = (dist + Math.abs(a[k+b] - a[k])) % 100000;
			k+=b;
		}
		System.out.println(dist);
	}

}