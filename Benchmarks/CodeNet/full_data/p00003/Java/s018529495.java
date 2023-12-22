import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			System.out.println(isRightTriangle(a, b, c) ? "YES" : "NO");
		}
	}
	
	public static boolean isRightTriangle(int a,int b,int c) {
		int[] x = new int[3];
		x[0] = a; x[1] = b; x[2] = c;
		Arrays.sort(x);
		return x[0] * x[0] + x[1] * x[1] == x[2] * x[2];
	}

}