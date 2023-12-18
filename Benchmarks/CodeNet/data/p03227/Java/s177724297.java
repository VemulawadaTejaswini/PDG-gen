import java.util.Scanner;
import java.lang.Math;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String n = stdIn.next();
		if (n.length() == 2) 
			System.out.print(n);
		else {
			char[] a = new char[3];
			for (int j = 0; j < 3; j++)
				a[j] = n.charAt(j);
			for (int i = 2; i >= 0; i--)
				System.out.print(a[i]);
		}
	}
}