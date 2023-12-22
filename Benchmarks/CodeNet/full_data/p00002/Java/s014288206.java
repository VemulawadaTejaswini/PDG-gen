import java.util.Scanner;

public class Main{
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		while(scan.hasNext()){
			String s1 = scan.next();
			String s2 = scan.next();
			int i =  Integer.parseInt(s1) + Integer.parseInt(s2);
			String s = String.valueOf(i);
			System.out.println(s.length());
		}
		System.exit(0);
	}
}