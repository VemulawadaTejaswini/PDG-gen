import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    long h, w;
	    long ans = 0;
	    Scanner scan = new Scanner(System.in);

	    do {
	      h = scan.nextInt();
	      w = scan.nextInt();
	    } while(1 < h && Math.pow(10, 9) < w);

	    if(w%2==0 || h%2==0) {
	      ans = (w*h)/2;
	    } else {
	      ans = (int)((w*h)/2) + 1;
	    }

	    System.out.println(ans);
	  }
}