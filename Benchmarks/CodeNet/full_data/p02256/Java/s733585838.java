import java.util.Scanner;
public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	int x = scan.nextInt();
	int y = scan.nextInt();
	int gcd = 0;
	if (x > y) {
	    gcd = gcd(y, x % y);
	} else {
	    gcd = gcd(x, y % x);
	}
	System.out.println(gcd);
    }
    static int gcd (int x, int y) {
	int max = 1;
	for (int i = 1; i <= y; i++) {
	    if (x % i == 0 && y % i == 0) {
		max = i;
	    }
	}
	return max;
    }
}