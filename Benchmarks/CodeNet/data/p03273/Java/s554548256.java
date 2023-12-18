import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		String[] s = new String[H + 1];
		String[][] a = new String[H + 1][W + 1];
		int count = 1;
		
		for(int i = 1; i <= H; i++) {
			s[i] = sc.next();
		}
		
		for(int i = 1; i <= H; i++) {
			count = 1;
			for(int j = 1; j <= W; j++) {
				a[i][j] = s[i].substring(j - 1, j);
				if(j >= 2) {
					if((a[i][j].equals(a[i][j - 1])) && (a[i][j].equals("."))) {
						count++;
					}
				}
			}
			if(count == W) {
				for(int k = 1; k <= W; k++) {
					a[i][k] = "n";
				}
			}
		}

		for(int i = 1; i <= W; i++) {
			count = 0;
			for(int j = 1; j <= H; j++) {		
				if(((a[j][i].equals(".")) || (a[j][i].equals("n")))) {
					count++;
				}	
			}
			if(count == H) {
				for(int k = 1; k <= H; k++) {
					a[k][i] = "n";
				}
			}
		}
		
		for(int i = 1; i <= H; i++) {
			int count2 = 0;
			for(int j = 1; j <= W; j++) {
				if(!(a[i][j].equals("n"))) {
					System.out.print(a[i][j]);
				} else {
					count2++;
				}
				if((j == W) && (count2 != j)) {
					System.out.println();
				}
			}
		}
	}
}
