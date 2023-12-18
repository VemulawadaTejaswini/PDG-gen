
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        if (n==1) System.out.println(1);
        else if (isPrime(n)) System.out.println(digitLength(n));
        else{
        	if (n/10==0) System.out.println(2);
        	else{
        		int mul1 = largestMultiplier(n);
        		int mul2 = (int)(n/mul1);
        		System.out.println(Math.max(digitLength(mul1), digitLength(mul2)));
        	}
        }
	}
	public static boolean isPrime(long n){
		if (n==2||n==3) return true;
		if (n%2==0) return false;
		else{
			int square = (int)Math.sqrt(n);
			for (int i=3;i<=square;i=i+2){
				if (n%i==0){
					return false;
				}
			}
		}
		return true;
	}
	public static int largestMultiplier(long n){
		int max = 0;
		int square = (int)Math.sqrt(n);
		for (int i=2;i<=square;i++){
			if (n%i==0){
				max = i;
			}
		}
		return max;
	}
	public static int digitLength(long n){
		int length = 0;
		while(n>0){
			n = n/10;
			length ++;
		}
		return length;
	}
}
