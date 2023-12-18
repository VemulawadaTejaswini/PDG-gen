import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int c=sc.nextInt();
		int[][] d=new int[c][c];
		int[][] a=new int[n][n];
		for(int i=0;i<c;i++){
			for(int j=0;j<c;j++){
				d[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				a[i][j]=sc.nextInt()-1;
			}
		}
		
		int minScore=99999999;
		//0,0を何で塗るか
		for(int coo=0;coo<c;coo++){
			int score=0;
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					score+=d[a[i][j]][(i+j+coo)%c];
				}
			}
			if(minScore>score)minScore = score;
		}
		System.out.println(minScore);
	}
}
