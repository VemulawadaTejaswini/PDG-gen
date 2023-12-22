import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		String s = sc2.next();
		
		if(s.length() <= k) {
			System.out.println(s);
		} else {
			System.out.print(s.substring(0, k));
			System.out.println("...");
		}
	}
}