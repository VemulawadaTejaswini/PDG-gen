import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		String w = scan.next();
		w = w.toLowerCase();
		int wcount = 0;
		while (true) {
			String t = scan.nextLine();
			if(t.equals("END_OF_TEXT")) break;
			String[] tarray = t.split(" ");
			for ( String s : tarray) {
				s = s.toLowerCase();
				if (w.equals(s)) wcount += 1;
			}
		}
		System.out.println(wcount);
	}
	public static void main(String[] args) {
		new Main().run();
	}
}