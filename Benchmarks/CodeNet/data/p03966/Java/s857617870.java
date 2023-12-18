import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		new Main();
	}
	public Main(){
		new A().doIt();
	}
	class A{
		long euclid(long a, long b){
		    long temp;

		    if(a < b) { 
		    	temp = a;
		    	a = b;
		    	b = temp;
		    }
		    if(a % b == 0) return b;
		    return euclid( b, a % b );
		}
		void doIt(){
			int n = sc.nextInt();
			long A = 1;
			long B = 1;
			for(int i = 0;i < n;i++){
				long aa = sc.nextLong();
				long bb = sc.nextLong();
				if(A % aa != 0)A = A + aa - (A % aa);
				if(B % bb != 0)B = B + bb - (B % bb);
				long max = Math.max(A/aa,B/bb);
				A = max * aa;
				B = max * bb;
//				System.out.println(A+" "+B);
			}
			System.out.println(A+B);
		}
	}
}
