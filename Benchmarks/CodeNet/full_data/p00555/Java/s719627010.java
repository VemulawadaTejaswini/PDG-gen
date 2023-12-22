import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int n, m, d, i, j, k, counter = 0;
		boolean flag;
		String str;
		try (Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
			m = sc.nextInt();
			d = sc.nextInt();
			char[][] stage = new char[n][m];
			for(i = 0; i < n; i++) {
				str = sc.next();
				for(j = 0; j < m; j++) {
					stage[i][j] = str.charAt(j);
				}
			}
			for(i = 0; i < n; i++) {
				for(j = 0; j < m; j++) {
					for(k = 0, flag = true; k < d; k++) {
						if(i + k < n) {
							if(stage[i + k][j] == '#') {
								flag = false;
								break;
							}
						}else {
							flag = false;
						}
					}
					if(flag) {
						counter++;
					}
					for(k = 0, flag = true; k < d; k++) {
						if(j + k < m) {
							if(stage[i][j + k] == '#') {
								flag = false;
								break;
							}
						}else {
							flag = false;
						}
					}
					if(flag) {
						counter++;
					}
				}
			}
			System.out.println(counter);
		}
	}
}
