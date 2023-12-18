import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		String st = sc.next();
		System.out.println(st.replace("B", "").length() > st.replace("R", "").length() ? "Yes" : "No");
	}
}