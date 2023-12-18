import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count =0;
		String s = sc.next();
		String s1 = "CODEFESTIVAL2016";
		for (int i=0;i<s.length();i++) {
			if (s.charAt(i)!=s1.charAt(i)) {
				count ++;
			}
		}
		System.out.println(count);
	}
}