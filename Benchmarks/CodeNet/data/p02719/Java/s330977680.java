import java.util.*; 
import java.lang.*; 

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		long N = scan.nextLong();
		long K = scan.nextLong();
		
		if(N>=K){
		if(N%K==0){
			System.out.println(0);
		}
		else{
			if(N/2 >= N%K){
			N = N-N%K;
			System.out.println(N);
			}
			
			else{
			N = N+N%K;
			System.out.println(N);
			}
		}
		}
		
		else{
			if(K>=N*2){
				System.out.println(N);
			}
			
			else{
				System.out.println(K-N);
			}
		}
	}
}