import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		System.out.println((int)Math.min(st.length() - st.replace("1", "").length(),
			st.length() - st.replace("0", "").length()) * 2);
	}
}