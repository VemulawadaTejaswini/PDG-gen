import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long ch[] = new long[4];
		String str = sc.next();
		for(int i = 0; i < 4; i ++) {
			ch[i] = str.charAt(i);
		}
		Arrays.sort(ch);
		System.out.println(ch[0] == ch[1] && ch[2] == ch[3] && ch[1] != ch[2] ? "Yes" : "No");
	}
}