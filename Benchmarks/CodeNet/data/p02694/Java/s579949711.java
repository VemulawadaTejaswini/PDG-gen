import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long x = in.nextLong();
		long cur = 100; 
		int year = 0;
		while(cur < x) {
			year += 1;
			cur += (cur * (0.01));
		}
		System.out.println(year);
	}
} 
