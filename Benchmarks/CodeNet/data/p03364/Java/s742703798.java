import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		char[][] matA = new char[n][n];
		
		for(int i = 0; i < n; i++){
			String tmpArray = br.readLine();
			
			for(int j = 0; j < n; j++){
				matA[i][j] = tmpArray.charAt(j);
			}
		}
		
		char[][] matB = new char[n][n];
		
		long result = 0;
		for(int a = 0; a < n; a++){
			for(int b = 0; b < n; b++){
//				System.out.println("a = "+a+" b = "+b);
				boolean good = true;
				//配列の転写
				for(int i = 0; i < n; i++){
					for(int j = i + 1; j < n; j++){	
						int A = i - a;
						if(A < 0){
							A += n;
						}
						
						int B = j - b;
						if(B < 0){
							B += n;
						}
//						System.out.println(i+" "+j+" "+A+" "+B);
						matB[i][j] = matA[A][B];
						matB[j][i] = matA[B][A];
						
						if(matB[i][j] != matB[j][i]){
							good = false;
							break;
						}
					}
					
					if(!good){
						break;
					}
				}
				
				if(good){
					result++;
				}
			}
		}
		
		System.out.println(result);
	}
}

