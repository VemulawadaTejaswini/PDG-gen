import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int[][] num = new int[r][c];

		for(int i = 0; i < num.length; i++){
			for(int j = 0; j < num[i].length; j++){
				num[i][j] = sc.nextInt();
			}
		}

		int[][] ans = new int[r+1][c+1];
		for(int i = 0; i < num.length; i++){
			for(int j = 0; j < num[i].length; j++){
				ans[i][j] = num[i][j];
				ans[i][c] += num[i][j];
				ans[r][j] += num[i][j];
				ans[r][c] += num[i][j];
			}
		}
		for(int i = 0; i < ans.length; i++){
			for(int j = 0; j < ans[i].length; j++){
				if(j == ans[i].length - 1){
					System.out.printf("%d\n",ans[i][j]);
				}else{
					System.out.printf("%d ",ans[i][j]);
				}
			}
		}
	}
}


