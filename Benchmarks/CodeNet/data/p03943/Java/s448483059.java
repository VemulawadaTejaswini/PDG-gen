import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		Integer[] d = new Integer[3];
		d[0] = a;
		d[1] = b;
		d[2] = c;
		
		Arrays.sort(d,Collections.reverseOrder());
		
		if(d[0] == d[1]+d[2]) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}