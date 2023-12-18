import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		long mod = (long)(1e9+7);
		Scanner input = new Scanner(System.in);
		long X = input.nextLong();
		long cnt = 0;
		long cur = 100;
		while (cur<X) {
			cur*=1.01;
			cnt++;
		}
		System.out.println(cnt);
	}
}