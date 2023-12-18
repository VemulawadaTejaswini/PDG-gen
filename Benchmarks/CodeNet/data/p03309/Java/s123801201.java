import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] A = new int[N];
		int sum = 0;
		int min = 0;
		for(int i = 0; i < N; i++){
			A[i] = sc.nextInt() - i - 1;
			sum += A[i];
			min += Math.abs(A[i]);
		}
		
		System.out.println(sum);
		
		int avg = (int)Math.round(sum / N);
		
		for(int i = -1; i <= 1; i++){
			int v = avg + i;
			int ans = 0;
			for(int j = 0; j < N; j++){
				ans += Math.abs(v - A[j]);
			}
			if(ans < min) min = ans;
		}
		
		System.out.println(min);
	}
}