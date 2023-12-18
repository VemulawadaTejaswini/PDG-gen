import java.util.Scanner;
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long i = 100000000000L;
        for (long j=1; j<=n; j++) {
        		if(n%j == 0) {
        			long k = n/j;
        			if (i > (j+k-2)) i = j+k-2;
        		}
        }
        System.out.println(i);
    }
}