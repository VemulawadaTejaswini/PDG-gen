import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	String s = sc.next();
	boolean result = false;
	if (n % 2 == 0) {
	    if (s.substring(0,n/2).equals(s.substring(n/2))) {
		result = true;
	    }
	}
	System.out.print(result ? "Yes" : "No");
    }
}
