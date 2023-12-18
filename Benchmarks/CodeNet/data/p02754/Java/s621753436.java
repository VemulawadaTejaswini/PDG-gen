import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextInt();
        long a =scan.nextInt();
        long b = scan.nextInt();

        if(a == 0) {
        	System.out.println(0);
        	return;
        }
        if(b == 0) {
        	System.out.println(n);
        }
        long div = n / (a + b);
        long dif = n % (a + b);

        long ans = div * a;

        if(dif != 0) {
        	if(dif <= a) {
        		ans += dif;
        	}else {
        		ans += a;
        	}
        }
        System.out.println(ans);
    }
}