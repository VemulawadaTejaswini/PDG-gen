import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int i = Integer.parseInt(str, 2);
		System.out.println(Integer.bitCount(i));
		
	}
}
