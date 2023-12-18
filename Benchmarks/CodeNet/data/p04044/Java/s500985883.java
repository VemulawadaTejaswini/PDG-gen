import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextInt();
		ArrayList<String> s = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			s.add(sc.next());
		}
		s.sort(null);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			sb.append(s.get(i));
		}
		System.out.println(sb.toString());
		sc.close();
	}

	public static void main(String[] args) {
		new Main().run();
	}
}