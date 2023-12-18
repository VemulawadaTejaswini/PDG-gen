import java.util.*;
 
class Main {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[3][3];
		int[] b = new int[10];
		boolean[][] appear = new boolean[3][3];
		String ans = "No";
 
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				a[i][j] = sc.nextInt();
				appear[i][j] = false;
			}
		}
 
		int n = sc.nextInt();

		for(int i = 0; i < n; i++){
			b[i] = sc.nextInt();
			for(int j = 0; j < 3; j++){
				for(int k = 0; k < 3; k++){
					if(a[j][k] == b[i]){
						appear[j][k] = true;
					}
				}
			}
		}
 
		for(int i = 0; i < 3; i++){
			if(appear[i][0] && appear[i][1] && appear[i][2])
				ans = "Yes";
		}
		for(int i = 0; i < 3; i++){
			if(appear[0][i] && appear[1][i] && appear[2][i])
				ans = "Yes";
		}
		if(appear[0][0] && appear[1][1] && appear[2][2]){
			ans = "Yes";
		}
		if(appear[0][2] && appear[1][1] && appear[2][0]){
			ans = "Yes";
		}
		System.out.println(ans);
	}
}