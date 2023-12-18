import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		long long int D = 0;
		long long int N = sc.nextInt();
		long long int K = sc.nextInt();
		
		int c[] = new int[100000];
		

		for(long long int i = 0; i<N; i++){
			long long int a = sc.nextInt();
			long long int b = sc.nextInt();
			
			c[a-1] = c[a-1] + b;			
		}
		

		long long int j = 0;
		
		while(K>0){
			D = j + 1;
			K = K - c[j];
			j++;
		}
		
		System.out.println(D);
	}
}
