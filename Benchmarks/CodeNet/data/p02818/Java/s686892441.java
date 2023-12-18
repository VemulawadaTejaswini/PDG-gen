import java.util.Scanner;
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		long A = sc.nextLong();
		long B = sc.nextLong();
      	long K = sc.nextLong();
      
      	long i, j;
      
      	if (A >= K) {
          	i = A - K;
        	System.out.print(i + " " + B);
        }
      
      	if (A < K) {
        	i = A - K;
          	j = B - (K - A);
          	
            if (j > 0){
            	System.out.print(0 + " " + j);
            } else {
            	System.out.print(0 + " " + 0);
            }
        }

	return;

	}
}