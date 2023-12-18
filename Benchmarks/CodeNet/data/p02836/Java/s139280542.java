import java.util.*;
import static java.lang.System.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		char[] s = sc.next().toCharArray();
		int roop = s.length / 2;
		for (int i = 0; i < roop; i++) {
			if (s[i] != s[s.length  - 1- i])
				cnt++;
		}
		out.print(cnt);
	}
}