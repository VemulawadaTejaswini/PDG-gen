import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		ArrayList<Stack<Integer>> stack = new ArrayList<Stack<Integer>>();

		int n = in.nextInt(), loop = in.nextInt();
		for(int i = 0; i < n ; i++) {
			Stack<Integer> stk = new Stack<>();
			stack.add(stk);
		}

		for(int i = 0; i < loop; i++) {
			int odr = Integer.parseInt(in.next()), index = Integer.parseInt(in.next());

			switch(odr) {
				case 0:
					stack.get(index).push(Integer.parseInt(in.next()));
					break;

				case 1:
					if(!stack.get(index).isEmpty()) {
						out.println(stack.get(index).peek());
					}
					break;

				case 2:
					if(!stack.get(index).isEmpty()) {
						stack.get(index).pop();
					}
					break;
			}
		}
		out.flush();
		in.close();

	}

}



