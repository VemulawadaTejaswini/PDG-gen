import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < w + 2; i++) {
			sb.append("#");
		}
		ArrayList<String> ar = new ArrayList<>();
		ar.add(sb.toString());
		for(int i = 0; i < h; i++) {
			String str = "#";
			str += sc.next();
			str += "#";
			ar.add(str);
		}
		ar.add(sb.toString());
		for(String s : ar) {
			System.out.println(s);
		}
	}
}