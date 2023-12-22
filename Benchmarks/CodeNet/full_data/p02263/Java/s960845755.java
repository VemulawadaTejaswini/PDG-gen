import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String[] str = stdIn.nextLine().split(" ");
		Deque<Integer> stack = new LinkedList<Integer>();

		for (int i=0; i<str.length; i++) {
			char c = str[i].charAt(0);
			if(c>='0' && c<='9'){
				stack.add(Integer.parseInt(str[i]));
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