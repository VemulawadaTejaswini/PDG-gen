import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String n = kb.next();
		int k = kb.nextInt();
		
		String num = Integer.toString(Integer.parseInt(n,10),k);
		System.out.println(num.length());
	}
}
