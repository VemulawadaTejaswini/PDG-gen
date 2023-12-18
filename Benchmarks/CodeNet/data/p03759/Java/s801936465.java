import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		
		if (b-a == c-b) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
}