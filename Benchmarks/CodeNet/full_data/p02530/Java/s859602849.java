import java.util.*;
import java.math.*;

public class Main {
    public static void main (String [] args) {
	Scanner in = new Scanner(System.in);

	int n = in.nextInt(), t = 0, h = 0;
	for (int i = 0 ; i < n ; i++) {
	    String Ta = in.next(), Ha = in.next();

	    if (Ta.equals(Ha)) {
		t++; h++;
	    } else if (Ta.compareTo(Ha) > 0) {
		t += 3;
	    } else {
		h += 3;
	    }
	}
	System.out.println(t + " " + h);
    }
}