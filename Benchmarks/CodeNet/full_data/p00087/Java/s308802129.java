import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	
	Scanner sc = new Scanner(System.in);
	
	void run() {
		String n;
		Stack<Double> stack = new Stack<Double>();
		StringTokenizer st;
		double a, b;
		while (sc.hasNext()) {
			st = new StringTokenizer(sc.nextLine());
			while (st.hasMoreTokens()) {
				n = st.nextToken();
				if (n.equals("+")) {
					a = stack.pop();
					b = stack.pop();
					stack.push(b+a);
				} else if (n.equals("-")) {
					a = stack.pop();
					b = stack.pop();
					stack.push(b-a);
				} else if (n.equals("*")) {
					a = stack.pop();
					b = stack.pop();
					stack.push(b*a);
				} else if (n.equals("/")) {
					a = stack.pop();
					b = stack.pop();
					stack.push(b/a);
				} else {
					stack.push(Double.valueOf(n));
				}
			}
			System.out.println(stack.pop());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().run();
	}

}