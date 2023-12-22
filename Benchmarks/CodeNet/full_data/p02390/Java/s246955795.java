import java.util.*;

public class Main {
	public static void main(String args[] ){
	    Scanner sc = new Scanner(System.in);
	    int s = sc.nextInt();
	    int h, m;
	    h = s / 3600;
	    m = s % 3600 / 60;
	    s = s % 60;
	    System.out.println(h+":"+m+":"+s);
	}
}

