
import java.util.*;

/* No.10032 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] stack = new String[1000];
		int index = 0;
		while ( !sc.hasNext("quit") ) {
			String order = sc.next();
			if ( order.equals("push") )
				stack[index++] = sc.next();
			else
				System.out.println(stack[index---1]);
			if ( index == stack.length - 1 ) index = 0;
			if ( index == 0 ) index = stack.length-1;
		}
	}
}