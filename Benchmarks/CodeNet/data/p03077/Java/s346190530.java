import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long size = Long.MAX_VALUE;
		long time = 0;
		for (int i = 0; i < 5; i++) {
		    long max = sc.nextLong();
		    if (max < size) {
		        time = (n + max - 1) / max + i;
		        size = max;
		    } else {
		        time++;
		    }
		}
		System.out.println(time);
	}
}
