import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String num = scan.next();
		long sum = 0;
		for(char c : num.toCharArray()) sum+=(c-'0');
		System.out.println(sum%9 == 0 ? "Yes" : "No");
		scan.close();
	}
}