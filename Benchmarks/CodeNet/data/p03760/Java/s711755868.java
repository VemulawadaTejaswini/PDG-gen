import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String O = sc.next();
		String E = sc.next();
		for(int i = 0;i < O.length() - 1;i ++) {
			System.out.print(O.charAt(i));
			System.out.print(E.charAt(i));
		}
		System.out.print(O.charAt(O.length() - 1));
		if(O.length() == E.length()) {
			System.out.println(E.charAt(E.length() - 1));
		}
	}
}