import java.util.*;

public class Main {
		public static void main(String[] args) {
			int i = 0;
			int atari = 0;
			Scanner scanner = new Scanner(System.in);
			String s = scanner.nextLine();
			String t = scanner.nextLine();
			String s_ = "";
			String t_ = "";
			for (i=0; i<3; i++) {
				s_ = s.substring(i, i+1);
				t_ = t.substring(i, i+1);
				if (s_.equals(t_)) {
					atari++;
				}
			}
			System.out.println(atari);
		}
}