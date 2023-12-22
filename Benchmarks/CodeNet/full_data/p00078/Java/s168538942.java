import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			if(n == 0) break;
			int[][] a = new int[n][n];
			int i = n / 2 + 1;
			int j = n / 2;
			int num = 1;
			while(n * n >= num) {
				if(a[i % n][j % n] == 0) {
					a[i % n][j % n] = num;
					num++;
					i++;
					j++;
				}else {
					i++;
					j--;
					a[i % n][j % n] = num;
					num++;
					i++;
					j++;
				}
			}
			for(int k = 0; k < n; k++) {
				for(int l = 0; l < n; l++) {
					System.out.printf("%4d", a[k][l]);
				}
				System.out.println();
			}
		}
		sc.close();
	}
}
