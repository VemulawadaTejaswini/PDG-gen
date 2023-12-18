import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] a = new int[3][3];
		int[] b = new int[10];
		int N = 0;
		boolean[][] appear = new boolean[3][3];
		String ans = null;

		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				a[i][j] = sc.nextInt();
			}
		}

		N = sc.nextInt();

		for(int i = 0; i < N; i++){
			b[i] = sc.nextInt();
		}
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				appear[i][j] = false;
				for(int k = 0; k < N; k++){
					if(a[i][j] == b[k]){
						appear[i][j] = true;
					}
				}
				if(appear[0][j] == appear[1][j] && appear[1][j] == appear[2][j]){
					ans = "Yes";
				}else if(appear[i][0] == appear[i][1] && appear[i][1] == appear[i][2]){
					ans = "Yes";
				}else if(appear[0][0] == appear[1][1] && appear[1][1] == appear[2][2]){
					ans = "Yes";
				}else{
					ans = "No";
				}
			}
		}
		System.out.println(ans);
	}
}