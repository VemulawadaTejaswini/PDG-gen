import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;
	private String[] str;

	private int cursor = 0;

	private void mainrun() {
		scan = new Scanner(System.in);

		int n = Integer.parseInt(scan.nextLine());

		for(int i = 0;i < n;i++){
			cursor = 0;
			str = scan.nextLine().split("");
			System.out.println(looprun());
		}

		scan.close();
	}

	private Long looprun() {
		Deque<String> element = new LinkedList<String>();

		Deque<String> c = new LinkedList<String>();

		boolean numflag = false;

		for(int i = cursor;i < str.length;i++) {
			if(str[i].equals(" ")){
				continue;
			}
			if(str[i].equals("(")) {
				cursor = i + 1;
				element.add(Long.toString(looprun()));
				i = cursor;
				continue;
			}
			if(str[i].equals(")")) {
				cursor = i;
				break;
			}

			switch(str[i]) {
			case "+":
			case "-":
			case "*":
			case "/":
				if(!c.isEmpty()) {
					if(rank(c.getFirst()) >= rank(str[i])) {
						while(!c.isEmpty()) {
							if(rank(c.getFirst()) >= rank(str[i])) {
								element.add(c.remove());
							}else{
								break;
							}
						}
					}
				}

				c.push(str[i]);
				numflag = false;
				break;
			case "=":
				break;
			default: /*数値 0-9 */
				if(numflag) {
					String a = element.removeLast();
					element.add(a + str[i]);
				}else {
					element.add(str[i]);
					numflag = true;
				}
				break;
			}
		}

		while(!c.isEmpty()) {
			element.add(c.pop());
		}

		return cal(element);
	}

	private int rank(String s) {
		if(s.equals("*") || s.equals("/")) {
			return 2;
		}else { /* s.equals("+") || s.equals("-") */
			return 1;
		}
	}

	private Long cal(Deque<String> l) {
		Stack<String> c = new Stack<>();

		for(String s : l){
			switch(s) {
			case "+":
			case "-":
			case "*":
			case "/":
				long b = Long.parseLong(c.pop());
				long a = Long.parseLong(c.pop());
				if(s.equals("+")) {c.push(Long.toString(a + b));}
				if(s.equals("-")) {c.push(Long.toString(a - b));}
				if(s.equals("*")) {c.push(Long.toString(a * b));}
				if(s.equals("/")) {c.push(Long.toString(a / b));}
				break;
			default:
				c.push(s);
				break;
			}
		}

		return Long.parseLong(c.pop());
	}
}
