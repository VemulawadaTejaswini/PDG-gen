
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		int sumone = 0;
		if(s[0] == '1') {
			sumone++;
		}
		if(s[1] == '1') {
			sumone++;
		}
		if(s[2] == '1') {
			sumone++;
		}
		System.out.println(sumone);
	}
}
