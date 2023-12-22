import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		while ((n | m) != 0) {
			int place[] = new int[m];
			for (int i = 0; i < m; i++) {
				place[i] = 0;
			}
			
			for (int p = 0; p < n * m; p++) {
				place[p % m] = scan.nextInt();
			}
			
			int rank = m;
			int scr;
			for (int i = 0; i < m; i++) {
				int max = place[i];
				scr = i;
				for (int j = 0; j < m; j++) {
					if (max < place[j]) {
						scr = j;
						max = place[j];
					}
				}
				System.out.print(scr+1);
				place[scr] = -1;
			}
			System.out.println();
			n = scan.nextInt();
			m = scan.nextInt();
			
		}

	}

}