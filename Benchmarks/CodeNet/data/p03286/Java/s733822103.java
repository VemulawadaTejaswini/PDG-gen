
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String s = "";
		while (n != 0) {
			if (n % 2 != 0) {
				n--;
				s = "1" + s;
			} else {
				s = "0" + s;
			}
			n /= -2;
		}
		
		System.out.println(s);
	}
}