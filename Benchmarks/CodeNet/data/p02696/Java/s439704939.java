import java.util.Scanner;
 
class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextInt();
        long B = sc.nextInt();
        long N = sc.nextInt();
        long max = 0;
        
        for(long x  = 0; x <= N; x++) {
        	long tmpMax = (x % B * A -(A * x) % B) / B;
        	if(tmpMax > max) {
        		max = tmpMax;
        	}        	      	
        }
        
        System.out.print(max);
	}
}

