import java.util.Scanner;

public class Main {
  public static void main(String... args) {
	Scanner sc = new Scanner(System.in);
	String a = sc.nextLine();
	int b = 0;
	for (int index = 0; index < a.length() ; index++) {
		String c = a.substring(index, index + 1);
		if (c.equals("1")) {
			b = b + 1;
		}
	}
	System.out.println(b);
  }
}
