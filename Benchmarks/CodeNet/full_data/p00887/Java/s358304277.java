import java.util.*;

public class D{
	int n,m,d;
	public void run(){
		Scanner cin = new Scanner(System.in);
		while(true){
			m = cin.nextInt();
			n = cin.nextInt();
			d = cin.nextInt();
			if(m==0) break;
			int i,j,k,l;
			int[] board = new int[n * m];
			for(i=0;i<n;i++){
				for(j=0;j<m;j++){
					board[i * m + j] = cin.nextInt();
				}
			}
			int[][] matrix = new int[n*m][n*m];
			for(i=0;i<n;i++){
				for(j=0;j<m;j++){
					for(k=0;k<n;k++){
						for(l=0;l<m;l++){
							if(Math.abs(i-k)+Math.abs(j-l) == d){
								matrix[i*m+j][k*m+l] = 1;
							}
						}
					}
					matrix[i*m+j][i*m+j] = 1;
				}
			}
			int len = n*m;
			for(i=0;i<len;i++){
				for(j=i;j<len;j++){
					if(matrix[j][i]==1) break;
				}
				if(j!=len){
					int[] tmp = matrix[j].clone();
					matrix[j] = matrix[i].clone();
					matrix[i] = tmp.clone();
					for(l=i+1;l<len;l++){
						if(matrix[l][i]==0) continue;
						for(k=i;k<len;k++){
							matrix[l][k] ^= matrix[i][k];
						}
					}
				}
			}
			for(i=0;i<len;i++){
				for(j=0;j<len;j++){
					//System.out.print(matrix[i][j] + " ");
				}
				//System.out.println();
			}
			
			int[] ret = new int[len];
			for(i=0;i<len;i++){
				if(ret[i] != board[i]){
					if(matrix[i][i]==0) break;
					else{
						for(j=i;j<len;j++){
							ret[j] ^= matrix[i][j];
						}
					}
				}
			}
			//System.out.println(i);
			if(i!=len) System.out.println(0);
			else System.out.println(1);
		}
	}

	boolean ok(int y, int x){
		return y>=0 && x >=0 && y<n && x<m;
	}
	
	public static void main(String args[]) throws Exception{
		new D().run();
	}
}