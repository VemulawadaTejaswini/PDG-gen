import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String b = "Three";
		for(int i=0 ; i<a ; i++) {
			String c = sc.next();
			if(c.equals("Y")) {
				b = "Four";
			}
		}
		System.out.println(b);
	}
}