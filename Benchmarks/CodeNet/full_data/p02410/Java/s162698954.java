import java.util.*;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[][] vectorA = new int[n][m];
		int[] vectorB = new int[m];
		int[] vectorC = new int[n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				int elm = scan.nextInt();
				vectorA[i][j] = elm;
				//if(j == m -1){
					//String ent = scan.next();
				//}
			}
		}
		for(int i = 0; i < m; i++){
			int elm = scan.nextInt();
			vectorB[i] = elm;
		}

		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				vectorC[i] += vectorA[i][j] * vectorB[j];
			}
		}

		for(int i = 0; i < n; i++){
			System.out.println(vectorC[i]);
		}
	}
}