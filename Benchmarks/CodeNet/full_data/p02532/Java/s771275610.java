import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int j = sc.nextInt();
		Stack<String>[] t = new Stack[j+1];
		for ( int i = 1; i <= j; i++ )
			t[i] = new Stack<String>();
		while ( !sc.hasNext("quit") ) {
			String order = sc.next();
			int index = sc.nextInt();
			if ( order.equals("push") )
				t[index].push(sc.next());
			else if ( order.equals("pop") )
				System.out.println(t[index].pop());
			else {
				int to = sc.nextInt();
				t[to].push(t[index].pop());
			}
		}
	}
}