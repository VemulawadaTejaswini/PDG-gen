import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		long total = 0;
		for (int i = 0; i < n; i++) {
		    int x = sc.nextInt();
		    if (x >= d) {
		        total += x - d;
		    }
		}
		if (total <= 0) {
		    System.out.println("kusoge");
		} else {
		    System.out.println(total);
		}
	}
}

