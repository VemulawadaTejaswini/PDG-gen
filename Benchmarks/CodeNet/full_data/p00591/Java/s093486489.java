import java.util.*;

class Main {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		for(;;){
			int n = in.nextInt();
			if(n == 0) return ;
			int mat[][] = new int[n][n];
			int up[][]  = new int[n][n];
			for(int i=0; i<n; i++)
				for(int j=0; j<n; j++)
					mat[i][j] = in.nextInt();
			for(int i=0; i<n; i++){
				int pos = -1;
				int mi = 1<<30;
				for(int j=0; j<n; j++){
					if(mat[i][j] == mi){
						pos = -1;
					}
					else if(mat[i][j] < mi){
						mi = mat[i][j];
						pos = j;
					}
				}
				if(pos >= 0){
					up[i][pos] += 1;
				}
			}
			for(int j=0; j<n; j++){
				int pos = -1;
				int ma = -(1<<30);
				for(int i=0; i<n; i++){
					if(mat[i][j] == ma){
						pos = -1;
					}
					else if(mat[i][j] > ma){
						ma = mat[i][j];
						pos = i;
					}
				}
				if(pos>=0){
					up[pos][j] += 2;
				}
			}
			int i=0, j=0;
			boolean f=true;
			for(i=0; i<n; i++){
				for(j=0; j<n; j++){
					if(up[i][j] == 3){
						f = false;
						break;
					}
				}
				if(!f) break;
			}
			System.out.println(((i==n) && (j==n))?0:mat[i][j]);
		}
	}
}