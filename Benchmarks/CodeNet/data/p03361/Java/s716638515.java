import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		boolean x[][] = new boolean[a + 2][b + 2];
		for (int i = 1; i < b; i++) {
			String e = in.next();
			for (int j = 1; j <= a; j++) {
				if (e.charAt(j-1) == '#') {
					x[j][i] = true;
				} else {
                    x[j][i] = false;   
				}
			}
		}
		Boolean flag = true;

		for (int i = 1; i<= b ; i++) {
			for (int j = 1; j<=a ; j++) {
				if(x[j][i]) {
					if (x[j - 1][i] || x[j][i - 1] || x[j + 1][i] || x[j][i + 1]) {
					} else {
						flag = false;
					}					
				}

			}
		}

		if (flag) {
			System.out.println("No");
		} else {
			System.out.println("Yes");

		}

	}

}
