import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int W= sc.nextInt();
		int H = sc.nextInt();
		int[] p = new int[W+1];
		int[] q = new int[H+1];
		long[][] m = new long[W+1][H+1];
		int add =0;


		long total = 0;

		for (int i = 0; i < W ;i++) {
			for (int j = 0; i < H; i++){
				m[i][j] = 0;
			}
		}


		for (int i = 1; i < W + 1; i++) {
			p[i]  = sc.nextInt();
		}
		p[0] = 0;

		for (int i = 1; i < H + 1; i++) {
			q[i]  = sc.nextInt();
		}
		q[0] = 0;

		for (int i = 0; i <= W ;i++) {
			for (int j = 0; j <= H; j++){

				if (i -1 >= 0 && j -1 >= 0){
					m[i][j]= Math.min(m[i-1][j] + p[i],m[i][j-1] + q[j]);

					if (m[i-1][j] + p[i] == m[i][j-1] + q[j]){
						add = Math.min(p[i], q[j]);
					}else if (m[i-1][j] + p[i] > m[i][j-1] + q[j]) {
						add = q[j];
					}else {
						add = p[i];
					}

				//	System.out.println("i="+i +" "+"j="+j +" "+m[i][j]);
				} else if (i -1 >= 0) {
					m[i][j]= m[i-1][j] + p[i];
					add = p[i];
				//	System.out.println("i="+i +" "+"j="+j +" "+m[i][j]);

				}	else if(j - 1 >= 0){


					m[i][j] = m[i][j-1] + q[j];
					add = q[j];

				//	System.out.println("i="+i + " " +"j="+j +" "+m[i][j]);
				}

				total += add;

			}
		}

		System.out.println(total);
		sc.close();
	}

}
