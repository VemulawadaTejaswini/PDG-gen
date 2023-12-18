import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int A = sc.nextInt();
		int[] H = new int[N];
		double a = 10000000;
		int b = 0;
		for(int i=0; i<N; i++) {
			H[i] = sc.nextInt();
		}
		sc.close();
		for(int i=0; i<N; i++) {
			double x = T -H[i]*6;
			if(Math.abs(A*1000-x)<a) {
				a = Math.abs(A*1000-x);
				b = i+1;
			}
		}
		System.out.println(b);
	}

}