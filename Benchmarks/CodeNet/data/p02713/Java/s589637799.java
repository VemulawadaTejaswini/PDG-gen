import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int sum = 0;
		for(int a = 1; a < K +1; a++) {
			for(int b = 1; b < K +1; b++) {
				for(int c = 1; c < K +1; c++) {
					sum += gcd(gcd(a, b), c);
				}
			}
		}
		System.out.println(sum);
		sc.close();
	}

/**
*	ユークリッドの互除法
*/		
    static int gcd(int a, int b) {
    	if(b == 0)return(a);
    	return(gcd(b, a % b));
		
    }
	
}