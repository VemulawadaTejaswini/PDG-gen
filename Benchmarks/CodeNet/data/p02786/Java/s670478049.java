import java.util.Scanner;

public class Main {
	
	static int count = 1;

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		long h = Long.parseLong(scan.nextLine());
		
		test(h);
		System.out.println((long) Math.pow(2, count) - 1);
	}
	
	public static void test(long hp) {
		hp = hp / 2;
		if (hp == 0) return; 
		count++;
		test(hp);
	}
	
}