import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		boolean isA = true;
		StringBuilder sb = new StringBuilder();
		for (char c : arr) {
		    if (isA && c == 'A') {
		        sb.append(c);
		        isA = false;
		    } else if (!isA && c == 'Z') {
		        sb.append(c);
		        isA = true;
		    }
		}
		if (sb.length() % 2 == 1) {
		    sb.deleteCharAt(sb.length() - 1);
		}
		if (sb.length() == 0) {
		    System.out.println(-1);
		} else {
		    System.out.println(sb);
		}
	}
}

