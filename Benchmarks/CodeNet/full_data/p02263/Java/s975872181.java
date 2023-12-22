import java.util.Scanner;

public class Main {

	static int max = 250;
	static int s[] = new int[max + 1];
	static int top;

	static void initialize() {
		top = 0;
	}

	static boolean isEmpty() {
		return top == 0;
	}

	static boolean isFull() {
		return top >= max;
	}

	static void push(int x) {
		if(! isFull()){
			top++;
			s[top] = x;
		}
	}

	static int pop() {
		if(! isEmpty()) {
			top--;
			return s[top+1];
		}else {
			return -1;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		initialize();
		String a = sc.nextLine();
		String[] tt = a.split(" ");
		for(int i=0;i<tt.length;i++){
			String t = tt[i];
			if(t.equals("+")) {
				int x = pop();
				int y = pop();
				push(x + y);
			}else if(t.equals("-")){
				int x = pop();
				int y = pop();
				push(y - x);
			}else if(t.equals("*")) {
				int x = pop();
				int y = pop();
				push(x*y);
			}else {
				int x = Integer.parseInt(t);
				push(x);
			}
		}
		System.out.println(pop());
	 }
}

