import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String s = stdIn.nextLine();
		Deque<Integer> stack = new LinkedList<Integer>();

		for (int i=0; i<s.length(); i++) {
			if((i&1) == 1)
				continue;
			char c = s.charAt(i);
			if(c>='0' && c<='9'){
				stack.add(Integer.parseInt(""+c));
			}else {
				int x = stack.pollLast();
				int y = stack.pollLast();
				switch(c){
					case '+':stack.add(x+y); break;
					case '-':stack.add(y-x); break;
					case '*':stack.add(x*y); break;
				}
			}
		}

		System.out.println(stack.poll());
	}
}