import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		double n = ((Math.sqrt(8 * N+1) - 1)/2);
		boolean can = n % 1 == 0;
		int a = (int)n;
		if(can) {
			System.out.println("Yes");
			System.out.println(a+1);
			int[][] A = new int[a][a+1];

			for(int i = 1;i <= N;i++) {
				int co = 0;
				int raw = 0;
				int aa = a;
				while(i > aa) {
					raw ++;
					aa += a-raw;
				}
				co = a - (aa - i)-1;
				A[co][raw] = i;
				A[raw][co+1] = i;
			}

			for(int i = 0;i < a+1;i++){
				System.out.print(a + " ");
				for(int j = 0;j < a;j++) {
					System.out.print(A[j][i]);
					if(j != a-1) {
						System.out.print(" ");
					}else {
						System.out.println();
					}
				}
			}




		}else {
			System.out.println("No");
		}
	}
}
