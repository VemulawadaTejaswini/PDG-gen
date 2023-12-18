import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int k = in.nextInt();
		int a;
		for(i = a; i <= b; i++) {
			if(i % k == 0) {
				System.out.println('OK');
				break;
			}
		}
		if(i > b) System.out.println('NG');
	}
} 
