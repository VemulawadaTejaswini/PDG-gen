import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
  	//?????°
	final static int VMAX = 10000;
	
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] C = new int[VMAX + 1];
		
		Integer[] A = new Integer[n + 1];
		Integer[] B = new Integer[n + 1];
		
		for(int i = 0; i <= VMAX; i++) C[i] = 0;
		
		String[] str = br.readLine().split(" ");
		for(int i = 0; i < n; i++){
			A[i + 1] = Integer.parseInt(str[i]);
			C[A[i + 1]]++;
		}
		
		for(int i = 1; i <= VMAX; i++) C[i] += C[i - 1];
		
		for(int j = 1; j <= n; j++){
			B[C[A[j]]] = A[j];
			C[A[j]]--;
		}
		
		for(int i = 1; i <=  n; i++){
			if(i != n){
				System.out.print(B[i] + " ");
			}else{
				System.out.println(B[i]);
			}
		}
	}
}