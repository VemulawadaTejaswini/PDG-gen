import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int n = stdin.nextInt();
		long m = stdin.nextLong();
		int count =0; 
		long sum = 0;
		
		long[] a = new long[n];
		for(int i = 0; i < n; i++){
			a[i] = stdin.nextLong();
		}
		
		long[] pattern = new long[(n * n / 2) + n / 2];
		
		for(int i = 0; i < n; i++){
			for(int j = i; j < n; j++){
				sum = 0;
				for(int k = i; k <= j; k++){
					sum += a[k]; 
				}
				if(sum % m == 0){
					count += 1;
				}
			}
		}
		
		System.out.println(count);
		
	}

}
