import java.util.Scanner;

class Main {
	static int n;
	static int[][] m;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true){
			n = scan.nextInt();
			if(n == 0)break;
			m = new int[n][n];
			put(n / 2 + 1, n / 2, 1);
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					System.out.printf("%4d", m[i][j]);
				}
				System.out.println();
			}
		}
	}
	
	static void put(int i, int j, int k){
		if(k > n * n)return;
		if(j == n){
			put(i, 0, k);return;
		}
		if(j < 0){
			put(i, n - 1,k);return;
		}
		if(i == n){
			put(0, j, k);return;
		}
		if(m[i][j] == 0){
			m[i][j] = k;
			put(i + 1, j + 1, k + 1);
		}
		else put(i + 1, j - 1, k);
	}
}