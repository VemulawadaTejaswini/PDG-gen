import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		for(int i=0; i<N; i++){
			a[i] = sc.nextInt();
		}
		sc.close();
		
		long sum = 0;
		long ans = Long.MAX_VALUE;
		long current = 0;
		Arrays.sort(a);	
		for(int n:a){
			sum += n;
		}
		for(int i=0; i<N-1; i++){
			current += a[i];
			ans = Math.min(ans, Math.abs(current-(sum-current)));
		}
		
		System.out.println(ans);
		

	}

}