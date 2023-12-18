import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    long h, w;
	    long ans = 0;
	    Scanner scan = new Scanner(System.in);

	    h = scan.nextLong();
	    w = scan.nextLong();

	    if(h >= 1 || w >= 1 || w <= Math.pow(10, 9)) {
		    if(w%2==0 || h%2==0) {
		      ans = (w*h)/2;
		    } else {
		      ans = (int)((w*h)/2) + 1;
		    }

		    System.out.println(ans);
		}
	}
}
