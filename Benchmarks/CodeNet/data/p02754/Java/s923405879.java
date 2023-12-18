import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long a = s.nextLong();
        long b = s.nextLong();
        if (n <= 0 || a <= 0 || b < 0) {
            System.out.println(0);
            return;
        }
        long rep = a * (n/(a+b)) + n%(a+b);
        System.out.println(rep);
	}
}