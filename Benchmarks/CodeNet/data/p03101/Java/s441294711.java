import java.util.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入
		int h = sc.nextInt();
		int w = sc.nextInt();
		int smallH = sc.nextInt();
		int smallW = sc.nextInt();

        System.out.println((h-smallH)*(w-smallW));
 
	}
}
