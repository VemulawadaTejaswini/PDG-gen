import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String s = scan.next();
		int q = scan.nextInt();
		for(int i = 0; i < q; i++) {
			int type = scan.nextInt();
			if(type == 1) {
				s = type1(s, scan.nextInt(), scan.next());
			} else if(type == 2) {
				System.out.println(type2(s, scan.nextInt(), scan.nextInt()));
			}
		}
		scan.close();
	}

	public static String type1(String s, int iq, String cq) {
		String ret = "";
		for(int i = 0; i < s.length(); i++) {
			if(i == (iq - 1)) ret += cq;
			else ret += s.charAt(i);
		}
		return ret;
	}

	public static int type2(String s, int lq, int rq) {
		int count = 0;
		HashSet<Character> set = new HashSet<Character>();
		for(int i = lq - 1; i < rq; i++) {
			Character c = s.charAt(i);
			if(!set.contains(c)) {
				count++;
				set.add(c);
			}
		}
		return count;
	}
}