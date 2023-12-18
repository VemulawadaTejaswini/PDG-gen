import java.util.*;

class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = Long.parseLong(sc.next());
		
		long k = (long)(int)Math.sqrt(n);
		long mini = n;
		long mini_1 = 1;
		long mini_2 = n;
		
		
		for(long i = 1; i <= k; ++i) {
		    if(n % i == 0) {
		        long tmp = n / i;
		        long abs_val = Math.abs(tmp - i);
		        
		        if(mini > abs_val) {
		            mini = abs_val;
		            mini_1 = i;
		            mini_2 = n / i;
		        }
		        else  continue;
		    }
		    else continue;
		}
		
		System.out.println(mini_1 - 1 + mini_2 -1);
	}
}