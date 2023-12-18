import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		int res = 0;
		while(true) {
			boolean flg = false;
			for (int i=0; i<N; i++) {
				if ( A[i]%2 == 0 ) {
					A[i] = A[i]/2;
				}else {
					flg = true;
					break;
				}
			}
			if (flg) break;
			res++;
		}
		System.out.println(res);
	}
}
