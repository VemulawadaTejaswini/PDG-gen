import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder(sc.next()).reverse();
		int count = 0;
		for (int i = 0; i < sb.length(); i++) {
		    char c = sb.charAt(i);
		    if (c == ')') {
		        count++;
		    } else if (c == '(') {
		        if (count > 0) {
		            count--;
		        }
		    }
		}
		for (int i = 0; i < count; i++) {
		    sb.append("(");
		}
		sb.reverse();
		count = 0;
		for (int i = 0; i < sb.length(); i++) {
		    char c = sb.charAt(i);
		    if (c == '(') {
		        count++;
		    } else if (c == ')') {
		        count--;
		    }
		}
		for (int i = 0; i < count; i++) {
		    sb.append(")");
		}
	    System.out.println(sb);
   }
}


