import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		long A = sc.nextLong();
		long B = sc.nextLong();
		long gcd = GCD(Math.max(A, B), Math.min(A, B));
		
		int count = 0;
		for(long i = 2; i * i <= gcd; i++){
			if(gcd % i == 0){
				do{
					gcd /= i;
				}while(gcd % i == 0);
				count++;
			}
		}
		if(gcd != 1)count++;
		System.out.println(count + 1);
		
	}
	
	static private long GCD(long X, long Y) {
		while(Y != 0){
			long temp = X % Y;
			X = Y;
			Y = temp;
		}
		return X;
	}
}