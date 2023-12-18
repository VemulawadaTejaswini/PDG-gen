import java.util.*;
 
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();

		long begin = 0L;
		long end = 1000000001L;
		long n = 0;
		while(end-begin>1){
			n = (end + begin)/2;
			int d = String.valueOf(n).length();
			if(a*n+b*d <= x){
				begin = n;
				n = (begin+end)/2;
			} else {
				end = n;
				n = (begin+end)/2;
			}
		}
		System.out.println(n);
	}
}
