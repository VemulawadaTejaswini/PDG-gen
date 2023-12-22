import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		String ans = "";
		while(n != 0) {
			n--;
			ans += (char)('a'+n%26);
			n/=26;
		}
		for(int i = ans.length()-1; i >= 0; i--) {
			System.out.print(ans.charAt(i));
		}
	}
}