import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String target = sc.next();
		String test = sc.next();
		int idx = 0;
		StringBuilder sb = new StringBuilder();
		while ((idx = target.indexOf(test, idx)) != -1) {
		    sb.append(idx).append("\n");
		    idx++;
		}
		System.out.print(sb);
	}
}

