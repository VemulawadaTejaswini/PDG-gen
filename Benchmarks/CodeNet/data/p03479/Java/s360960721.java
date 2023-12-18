import java.util.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(in);
    long x = sc.nextLong();
	 	long y = sc.nextLong();
		long cnt = 0;

		while (x <= y) {
			x *= 2;
			cnt++;
		}

		out.println(cnt);
	}
}
