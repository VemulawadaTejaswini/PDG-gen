import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ans = false;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s1 = String.valueOf(a);
		String s2 = String.valueOf(b);
		double n = Integer.parseInt(s1 + s2);
		int h = (int)Math.sqrt(n);
		if(Math.sqrt(n) == h) {
			System.out.println("Yes");
		}
		else System.out.println("No");
		sc.close();
	}

}
