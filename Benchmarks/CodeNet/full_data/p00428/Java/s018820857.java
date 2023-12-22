import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		while ((n | m) != 0) {
			int place[] = new int[m];
			int rank[] = new int[m];
			for (int i = 0; i < m; i++) {
				place[i] = 0;
				rank[i] = 0;
			}
			
			for (int p = 0; p < n * m; p++) {
				place[p % m] += scan.nextInt();
			}
			
			/*
			for (int i = 0; i < m; i++) {
				System.out.print(place[i]);
				if (i != m- 1) {
					System.out.print(" ");
				}else {
					System.out.println();
				}
			}
			*/
			
			int scr;
			for (int i = 0; i < m; i++) {
				int max = place[0];
				scr = 0;
				for (int j = 0; j < m; j++) {
					if (max < place[j]) {
						scr = j;
						max = place[j];
					}
				}
				rank[i] = scr + 1;
				place[scr] = -1;
			}
			for (int i = 0; i < m; i++) {
				System.out.print(rank[i]);
				if (i != m- 1) {
					System.out.print(" ");
				}else {
					System.out.println();
				}
			}
			n = scan.nextInt();
			m = scan.nextInt();
			
		}

	}

}