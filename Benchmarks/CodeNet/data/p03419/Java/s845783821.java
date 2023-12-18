import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt() ;
		int m = sc.nextInt();
		boolean[][] b = new boolean[n][m];
		//trueが表　falseが裏とする。
		for(int i = 0; i < n; i++) {
			Arrays.fill(b[i], true);
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {

				for(int x =-1; x < 2; x++) {
					for(int y = -1; y < 2; y++) {
						try {
							if(b[i+x][j+y]==true) {
								b[i+x][j+y] = false;
							}else {
								b[i+x][j+y] = true;
							}
						}catch(ArrayIndexOutOfBoundsException e) {}
					}
				}

			}
		}
		int count = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(b[i][j] == false) {
					count++;
				}
			}
		}

		System.out.println(count);

	}
}
