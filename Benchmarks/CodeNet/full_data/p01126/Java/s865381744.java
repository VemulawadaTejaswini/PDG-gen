import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans=0;
		
		while(true){
			int n = sc.nextInt();int m = sc.nextInt();int a = sc.nextInt();
			if(n==0 && m==0 && a==0) break;

			int[][] line = new int[m+1][n+1];
			for(int i=0; i < m; i++){
				for(int j=0; j < n-1; j++){
					line[i][j] = 0;
				}
			}
			
			for(int i=0; i < n; i++){
				int h = sc.nextInt(); int p = sc.nextInt(); int q = sc.nextInt();
				line[h][p] = q;
				line[h][q] = p;
			}
			
			for(int i=line.length-1; i > 0; i--){
				if(line[i][a]!=0){
					a = line[i][a];
				}
			}
			
			System.out.println(a);
		}
	}
}