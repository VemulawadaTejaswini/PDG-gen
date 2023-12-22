import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String s = sc.next();
		int n = sc.nextInt();
		String temp;
		for (int i=0; i<n; i++) {
			temp = sc.next();
			if (s.contains(temp)) {out.println(1);}
			else {out.println(0);}
		}
	}
}

