import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	try {
	    Scanner scan = new Scanner(System.in);
	    int a = scan.nextInt();
	    int b = scan.nextInt();
	    int s = a * b;
	    int l = 2 * (a + b);
	    System.out.println(s + " " + l);
	    scan.close();
	} catch (InputMismatchException e) {
	    System.out.println("??°?????\????????\??????????????????");
	}
    }
}