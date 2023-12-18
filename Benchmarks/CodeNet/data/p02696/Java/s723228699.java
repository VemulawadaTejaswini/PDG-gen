import java.util.Scanner;
 
class D {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long N = sc.nextLong();
        long max = 0;
        
        for(long x  = 0; x <= B-1; x++) {
        	long tmpMax = (x % B * A -(A * x) % B) / B;
        	if(tmpMax > max) {
        		max = tmpMax;
        	}        	      	
        }
        
        System.out.print(max);
	}
}

