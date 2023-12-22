

import java.util.Scanner;

public class Main {
	static boolean check(char[] a, char[]b){
		for(int i=0; i<8; i++){
			if(a[i] != b[i] && a[i] != '*')
				return false;
		}
		return true;
	}



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			if(n == 0 && m == 0)
				break;

			int money[] = new int[n];
			int hit = 0;
			String[] str1 = new String[n];
			String[] str2 = new String[m];
			char[][] a = new char[n][];
			char[][] b = new char[m][];

			for (int i = 0; i < n; i++) {
				str1[i] = sc.next();
				a[i] = str1[i].toCharArray();
				money[i] = sc.nextInt();

			}
			for (int i = 0; i < m; i++) {
				str2[i] = sc.next();
				b[i] = str2[i].toCharArray();
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (check(a[i], b[j]))
						hit += money[i];
				}
			}

			System.out.println(hit);

		}
	}

}