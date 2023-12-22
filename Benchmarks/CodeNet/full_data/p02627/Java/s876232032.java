import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String A = stdIn.next();
		char c[] = A.toCharArray();
		if(c[0]>=0x41 && 0x5a >= c[0]) {
			System.out.println("A");
		}else {
			System.out.println("a");
		}
		stdIn.close();
	}
}
