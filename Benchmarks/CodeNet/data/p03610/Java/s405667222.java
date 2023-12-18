import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(i == 0 || i % 2 == 0) System.out.print(c);
		}

	}

}
