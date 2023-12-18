import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);

	long a = sca.nextLong();
	long b = sca.nextLong();
	long c = sca.nextLong();
	long sahen = 4 * a * b;
	long uhen = (c - a - b) * (c - a - b);
	if(c-a-b > 0 && sahen < uhen) {
		System.out.println("Yes");
	}
	else {
		System.out.println("No");
	}

	// 後始末
	sca.close();
	}
}