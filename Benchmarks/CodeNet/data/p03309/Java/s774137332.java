import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		File file = new File("input.txt");
		Scanner sc = new Scanner(file);
		
		//Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++) A[i] = sc.nextInt() - (i + 1);
		Arrays.sort(A);
		
		int ans = 0;
		for(int i = 0; i < A.length; i++){
			ans += A[A.length-1] + 1 - A[i];
		}
		
		int min = A[0], max = A[A.length-1];
		for(int b = max; b >= min; b--){
			int diff = 0;
			for(int j = 0; j < A.length; j++){
				if(b < A[j]) diff++;
				else diff--;
			}
			if(diff < 0){
				ans += diff;
			}else{
				break;
			}
		}
		
		System.out.println(ans);
	}
}