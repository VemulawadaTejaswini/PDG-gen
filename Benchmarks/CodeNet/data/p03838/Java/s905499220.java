import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long x = input.nextLong();
		long y = input.nextLong();
		if (x>=0&&y>=0||x<=0&&y<=0) {
			if (x>y) {
				long cnt = Math.abs(y-x);
				System.out.println(cnt+2);
			}else System.out.println(y-x);
		}else {
			long tempx = Math.abs(x);
			long tempy = Math.abs(y);
			System.out.println(Math.abs(tempx-tempy)+1);
		}
	}
	/*Cases:
	 * 1. abs(y-x)
	 * 2. 
	 * 
	 * */
}