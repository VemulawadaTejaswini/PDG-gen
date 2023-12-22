import java.util.*;

public class Main {
    public static void main (String [] args) {
	Scanner in = new Scanner(System.in);

	int n = in.nextInt(),a,b;
	String [][] st = new String [n][1000];
	int [] pos = new int [n];

	while (true) {
	    String order = in.next(),s;

	    if (order.equals("push")) {
		a = in.nextInt();
		s = in.next();
		st[a-1][pos[a-1]++] = s;
	    } else if (order.equals("pop")) {
		a = in.nextInt();
		System.out.println(st[a-1][--pos[a-1]]);
	    } else if (order.equals("move")) {
		a = in.nextInt();
		b = in.nextInt();
		String str = st[a-1][--pos[a-1]];
		st[b-1][pos[b-1]++] = str;
	    } else {
		break;
	    }
	}
    }
}