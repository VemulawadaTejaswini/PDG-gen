import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    long h, w;
	    long ans = 0;
	    Scanner scan = new Scanner(System.in);

	    h = scan.nextLong();
	    w = scan.nextLong();

	    long ans1 = (h/2) * (w/2);
	    long ans2 = (h - (h/2)) * (w - (w/2));

	    if(h == 1 || w == 1) {
	    	System.out.println(1);
	    } else {
	    	ans = ans1 + ans2;

	  		System.out.println(ans);
	    }
	}
}