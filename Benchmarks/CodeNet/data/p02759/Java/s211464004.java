import java.util.Scanner;
 
class Bingo {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[3][3];
		int[] b = new int[10];
		int N = 0;
		boolean[][] appear = new boolean[3][3];
		String ans = "No";
 
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
			}
		}
 
		for(int i = 0; i < 3; i++){
			if(a[i][0] == a[i][1] && a[i][1] == a[i][2])
				ans = "Yes";
		}
		for(int i = 0; i < 3; i++){
			if(a[0][i] == a[1][i] && a[1][i] == a[2][i])
				ans = "Yes";
		}
		if(a[0][0] == a[1][1] && a[1][1] == a[2][2]){
			ans = "Yes";
		}
		if(a[0][2] == a[1][1] && a[1][1] == a[2][0]){
			ans = "Yes";
		}
		System.out.println(ans);
	}
}