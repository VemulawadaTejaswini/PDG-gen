import java.util.*;
public class Main {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long num = scan.nextLong();
		for(int i = 0; i < n - 1; i++) {
			long a = scan.nextLong();
			num = num * a;
			}
		}
		System.out.println(num);
		}
	}
 
}