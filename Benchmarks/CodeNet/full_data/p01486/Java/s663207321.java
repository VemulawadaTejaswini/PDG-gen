import java.util.Scanner;

public class Main {
	static char[] voice;
	static int i = 0;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		voice = sc.next().toCharArray();
		System.out.println(check() ? "Cat" : "Rabbit");
	}

	public static boolean check() {
		if (i == voice.length)
			return true;
		else {
			if (voice[i++] == 'm')
				check();
			else
				return false;
			if (voice[i++] == 'e')
				check();
			else
				return false;
			if (voice[i++] == 'w')
				check();
			else
				return false;
		}
		return true;
	}
}