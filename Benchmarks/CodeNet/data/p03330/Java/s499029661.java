import java.util.Scanner;
 
public class Main {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		
		int D[][] = new int[n][n];
		int C[][] = new int[c][c];

		for(int i=0;i<c;i++){
			for(int j=0;j<c;j++){
				C[i][j] = sc.nextInt();
			}
		}

		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				D[i][j] = sc.nextInt();
			}
		}

		int J[][] = new int[3][c];

		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				int k = (i+j)%3;
				for(int l=0;l<c;l++){
					J[k][l] += C[D[i][j]-1][l];
				}
			}
		}

		int min = Integer.MAX_VALUE;

		for(int i=0;i<c;i++){
			for(int j=0;j<c;j++){
				for(int k=0;k<c;k++){
					if(i==j || j==k || k==i) continue;
					min = Math.min(min,J[0][i] + J[1][j] + J[2][k]);
				}
			}
		}

		System.out.println(min);
	}
 
}