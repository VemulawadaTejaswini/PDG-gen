import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		String s = String.valueOf(n);
		int a = Integer.parseInt(s.charAt(0)+"");
		int l = s.length();
		boolean all = true;
		for(char c : s.toCharArray()) {
			if(c != '9') {
				all = false;
			}
		}
		if(l == 1) {
			System.out.println(s);
			return;
		}
		System.out.println(all ? 9*l : 9*(l-1)+a-1);
	}
}