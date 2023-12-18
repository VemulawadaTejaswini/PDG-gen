import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] s = in.next().toCharArray(), q = in.next().toCharArray();
		int c = 0;

		for(int i = 0; i < 3; i++)
			if(s[i] == q[i])
				c++;

		System.out.println(c);
		return;
	}
}
