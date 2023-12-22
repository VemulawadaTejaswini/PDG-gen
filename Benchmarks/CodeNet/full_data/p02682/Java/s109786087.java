import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();

		int KA =0;
		int KB =0;
		int KC = 0;
		int sum = 0;
		
		if(K>=A) {
			KA = A;
			KB = K - KA;
		}else {
			KA = K;
			KB = 0;
			KC = 0;
		}
		
		if(KB >= B) {
			KB = B;
			KC = K - A- B; 
		}else{
			KC = 0;
		}
		
		sum = (KA * 1) + (KB * 0) + (KC * -1);
			
		
		System.out.println(sum);
		
		sc.close();
	}
}