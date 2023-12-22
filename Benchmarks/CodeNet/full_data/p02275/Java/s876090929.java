import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
  	//?????°
	final static int MAX = 2000001;

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int [] A = new int[n];
		int [] B = new int[MAX];
		int[] Count = new int[MAX];
		String[] str = br.readLine().split(" ");
		int i;
		
		for(i = 0; i < A.length;i++){
			A[i] = Integer.parseInt(str[i]);
		}
		
		for(i = 0; i < n; i++){
			Count[A[i]]++;
		}
		for(i = 1; i < Count.length; i++){
			Count[i] = Count[i] + Count[i - 1];
		}
		
		for(i = A.length - 1; i >= 0; i--){
			B[Count[A[i]]] = A[i];
			Count[A[i]]--;
		}
		
		for(i = 1; i <= A.length; i++){
			if(i != A.length){
				System.out.print(B[i] + " ");
			}else{
				System.out.println(B[i]);
			}
		}
	}
}