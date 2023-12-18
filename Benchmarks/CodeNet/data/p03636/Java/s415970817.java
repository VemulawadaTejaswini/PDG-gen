import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] ch = s.toCharArray();
		int i = s.length();
		System.out.print(ch[0]);
		System.out.print(i-2);
		System.out.println(ch[s.length()-1]);
 	}
}