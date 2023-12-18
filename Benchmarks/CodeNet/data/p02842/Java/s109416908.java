import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i <= 50000; i++) {
		    if (i * 108 / 100 == n) {
		        System.out.println(i);
		        return;
		    }
		}
		System.out.println(":(");
	}
}
