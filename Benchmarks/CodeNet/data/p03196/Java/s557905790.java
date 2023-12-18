import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long p = sc.nextLong();

        double rr = p;
        long nn = n;
        while(nn > 1) {
        	rr = Math.sqrt((double)rr);
        	nn /= 2;
        }
        long res = (long)rr;

        while(res > 1) {
        	if(p % Math.pow(res, n) == 0) {
        		break;
        	}
        	res--;
        }
        System.out.println(res);
    }
}
