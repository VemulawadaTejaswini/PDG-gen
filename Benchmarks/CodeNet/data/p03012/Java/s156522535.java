import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] w = new int[N];

		for(int i=0;i<N;i++) {
			w[i] = sc.nextInt();

		}

		int s = 0;
		int r =0;

		int ans =500;
		for(int j=0;j<N-1;j++) {
			for(int i=0;i<=j;i++) {
				s = s + w[i];
			}

			for(int i=j+1;i<N;i++) {
				r = r + w[i];
			}

			ans = Math.min(Math.abs(s-r),ans);
			s=0; r=0;
		}

		System.out.print(ans);
	}

}
