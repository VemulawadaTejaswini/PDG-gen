
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		k--;
		StringBuilder sb = new StringBuilder(sc.next());
		char c = sb.charAt(k);
		if(c=='A') sb.setCharAt(k, 'a');
		if(c=='B') sb.setCharAt(k, 'b');
		if(c=='C') sb.setCharAt(k, 'c');
		System.out.println(sb.toString());
		sc.close();
	}

}
