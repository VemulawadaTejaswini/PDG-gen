import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	int count;
	{
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == '1') {
				count++;
			}
		}
		System.out.println(count);
	}
}