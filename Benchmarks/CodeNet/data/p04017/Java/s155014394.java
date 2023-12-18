import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args){
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			
			int[] x = new int[N+1];
			
			for(int i = 1; i<=N; i++){
				x[i] = scan.nextInt();
			}			
			
			int L = scan.nextInt();
			int Q = scan.nextInt();
			
			for(int i = 0; i<Q; i++){
				int a = scan.nextInt();
				int b = scan.nextInt();
				
				if(a > b){
					int tmp = a;
					a = b;
					b = tmp;
				}
				
				int ans = 1;
				int start = a;
				for(int j = a+1; j<=b; j++){
					if(x[j] - x[start] > L){
						ans++;
						start = j - 1;
					}
				}
				System.out.println(ans);
			}
		}
	}
}
