import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int r = sc.nextInt();
			int c = sc.nextInt();
			int q = sc.nextInt();
			if(r==0&&c==0&&q==0)break;
			int[][] m = new int[r][c];
			for(int i=0;i<r;i++){
				for(int j=0;j<c;j++)m[i][j]=sc.nextInt();
			}
			while(q--!=0){
				int r1 = sc.nextInt();
				int c1 = sc.nextInt();
				int r2 = sc.nextInt();
				int c2 = sc.nextInt();
				int min = m[r1][c1];
				for(int i=r1;i<=r2;i++){
					for(int j=c1;j<=c2;j++){
						min = Math.min(min, m[i][j]);
					}
				}
				System.out.println(min);
			}
		}
	}
}