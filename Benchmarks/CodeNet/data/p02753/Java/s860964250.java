import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		if(s.equals("AAA") || s.equals("BBB")){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		in.close();
	}
}
