import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int count = 0;
		char[][] a = new char[n][n];
		char[][] b = new char[m][m];

		for(int i = 0; i < n; i++){
			a[i] = scanner.next().toCharArray();
		}
		for(int i = 0; i < m; i++){
			b[i] = scanner.next().toCharArray();
		}

		if(m > n){
			System.out.println("No");
			return;
		}

		for(int i = 0; i < n-m+1; i++){
			count = 0;
			int l = 0;
			for(int j = 0; j < n-m+1; j++){
				//System.out.println(a[i][j] + ":" + b[i][j]);
				if(a[i][j] == b[0][l]){
					count++;
					for(int k = 1; k < m; k++){
						if(a[i+k][j] == b[k][j]){
							count++;
							l++;
						}
					}
				}
			}
			//System.out.println("count :"+ count);
			if(count == m*m){
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}