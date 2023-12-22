import java.util.Scanner;

public class Main {
	static char[] voice;
	static int i = 0;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		voice = sc.next().toCharArray();
		check();
		System.out.println(i == voice.length ? "Cat" : "Rabbit");
	}

	public static void check() {
		if (voice[i] != 'm')
			return;
		i++;
		check();
		if (voice[i] != 'e')
			return;
		i++;
		check();
		if (voice[i] != 'w')
			return;
		i++;
		return;
	}
}