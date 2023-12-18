import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		Set<Integer> m = new HashSet<>();
		for(int i = 0; i<3; i++) {
			m.add(sc.nextInt());
		}
		System.out.println(m.size());
		
		sc.close();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}