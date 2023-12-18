import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);		
		long s = in.nextLong();
		System.out.println("0 0 1 0 1 " + s);		
		in.close();
	}
}