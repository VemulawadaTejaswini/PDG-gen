import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	int a = sca.nextInt();
	int b = sca.nextInt();
	int c = sca.nextInt();

	if(a == b && b != c) {
		System.out.println("Yes");
	}
	else if(a == c && b != c) {
		System.out.println("Yes");
	}
	else if(b == c && a != c) {
		System.out.println("Yes");
	}
	else {
		System.out.println("No");
	}

	// ArrayList<String> list = new ArrayList<String>();
	// list.add("");

	// 後始末
	sca.close();
	}
}