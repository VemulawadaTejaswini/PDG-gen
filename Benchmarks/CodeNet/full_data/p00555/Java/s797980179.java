package extra;

import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int space = sc.nextInt();

			String[][] room = new String[n][m];

			for (int i=0; i<n; i++) {
				String s = sc.next();
				for (int j=0; j<m; j++) {
					room[i][j] = s.substring(j,j+1);
				}
			}

			int count=0;
			for (int i=0; i<n; i++) {
				for (int j=0; j<m; j++) {
					if (room[i][j].equals(".")) {
						if (j<m-space+1) {  //横比較
							boolean flag = true;
							for (int k=0; k<space; k++) {
								if (!room[i][j].equals(room[i][j+k])) flag = false;
							}
							if (flag) count++;
						}
						if (i<n-space+1) {  //縦
							boolean flag = true;
							for (int k=0; k<space; k++) {
								if (!room[i][j].equals(room[i+k][j])) flag = false;
							}
							if (flag) count++;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}
