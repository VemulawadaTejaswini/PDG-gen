
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String[][] s = new String[100][100];
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 100; j++) {
				if(i < 50) {
					s[i][j] = ".";
				} else {
					s[i][j] = "#";
				}
			}
		}
		a--;
		b--;
		int i = 0;
		int j = 0;
		while(b > 0) {
			s[i][j] = "#";
			b--;
			j += 2;
			if(j >= 100) {
				j = 0;
				i += 2;
			}
		}
		i = 99;
		j = 0;
		while(a > 0) {
			s[i][j] = ".";
			a--;
			j += 2;
			if(j >= 100) {
				j = 0;
				i -= 2;
			}
		}
		System.out.println(100 + " " + 100);
		for(int k = 0; k < 100; k++) {
			for(int l = 0; l < 100; l++) {
				System.out.print(s[k][l]);
			}
			System.out.println();
		}

	}

}
