import java.util.Scanner;
	public class Main {
		public static void main(String[] args) {
			int i, j;

			Scanner stdin = new Scanner(System.in);
			int n = stdin.nextInt();

			int [] num = new int[n];
			for ( i = 0; i < n; i++ ){
				num[i] = stdin.nextInt();
			}

			int tmp;
			for ( i = 0; i < n; i++ ){
				for( j = n-1; j > i; j-- ){
					if ( num[j] > num[j-1] ){
						tmp = num[j];
						num[j] = num[j-1];
						num[j-1] = tmp;
					}
				}
			}

			System.out.print(num[0]);
			for ( i = 1; i < n; i++ ){
				System.out.print(" " + num[i]);
			}
			}

	}