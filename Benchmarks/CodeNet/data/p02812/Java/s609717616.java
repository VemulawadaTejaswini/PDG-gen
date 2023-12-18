
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String S = in.next();
		int index = 0;
		int count = 0;
		while (index < N && index != -1) {
			index = S.indexOf("ABC", index);
			if (index != -1) {
				count++;
				index++;
			}
		}
		System.out.println(count);
		in.close();
	}
}