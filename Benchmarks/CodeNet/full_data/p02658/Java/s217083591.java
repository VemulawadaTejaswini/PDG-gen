import java.util.*;
public class Main {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long num = scan.nextLong();
		for(int i = 0; i < n - 1; i++) {
			long a = scan.nextLong();
			if(a == 0) {
				System.out.println(Integer.toString(0));
				return;
			} else {
				num = num * a;
			}
		}
		if(num > (long)Math.pow(10, 18)) {
			System.out.println("-1");
		} else {
			System.out.println(Long.toString(num));
		}
	}
 
}