import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		while ((n > 0) && (k > 0)){
			int[] s = new int[k];
			for (int i = 0; i < k; i++){
				s[i] = sc.nextInt();
			}
			int[][] b = new int[n][k];
			for (int i = 0; i < n; i++){
				for (int j = 0; j < k; j++){
					b[i][j] = sc.nextInt();
				}
			}
			int i = 0, j, flag = 1;
			while (i < n){
				j = 0;
				while (j < k){
					s[j] -= b[i][j];
					if (s[j] < 0){
						System.out.println("No");
						flag = 0;
						i = n;
						j = k;
					}
					j++;
				}
				i++;
			}
			if (flag > 0){
				System.out.println("Yes");
			}
			n = sc.nextInt();
			k = sc.nextInt();
		}
	}

}

