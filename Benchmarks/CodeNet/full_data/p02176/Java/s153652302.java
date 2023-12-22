import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] arr = sc.next().toCharArray();
		int x = 0;
		int y = 0;
		for (char c : arr) {
		    if (c >= 'A' && c <= 'M') {
		        y++;
		    } else if (c >= 'N' && c <= 'Z') {
		        y--;
		    } else if (c >= 'a' && c <= 'm') {
		        x++;
		    } else {
		        x--;
		    }
		}
		StringBuilder sb = new StringBuilder();
		if (x > 0) {
		    for (int i = 0; i < x; i++) {
		        sb.append("a");
		    }
		} else {
		    for (int i = 0; i > x; i--) {
		        sb.append("z");
		    }
		}
		if (y > 0) {
		    for (int i = 0; i < y; i++) {
		        sb.append("A");
		    }
		} else {
		    for (int i = 0; i > y; i--) {
		        sb.append("Z");
		    }
		}
		System.out.println(sb.length());
		System.out.println(sb);
	}
}

