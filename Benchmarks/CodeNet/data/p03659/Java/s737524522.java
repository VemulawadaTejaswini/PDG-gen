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
		
		long sum=0;
		for(int n:a){
			sum += n;
		}
		long ans = Long.MAX_VALUE;
		long current = 0;
		for(int i=0; i<N-2; i++){
			current += a[i];
			ans = Math.min(ans, Math.abs(sum-2*current));
		}
		
		System.out.println(ans);
	
	}

}