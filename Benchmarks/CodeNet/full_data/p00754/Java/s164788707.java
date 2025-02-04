import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		while(stdin.hasNext()){
			String line = stdin.nextLine();
			if (line.equals(".")) break;
			System.out.println(yesOrNo(isBalanced(line)));
		}
		System.exit(0);
	}
	private static String yesOrNo(boolean b){
		return b ? "yes" : "no";
	}
	private static boolean isBalanced(String line){
		bracketStuck bs = new bracketStuck();
		for(int i = 0; i < line.length(); i++){
			char c = line.charAt(i);
			if (c == '(' || c == ')' || c == '[' || c == ']') {
				if (! bs.processBracket(c)) return false;
			}
		}
		return true;
	}
}

class bracketStuck {
	private ArrayList<Integer> st = new ArrayList<Integer>();
	private void push(int i) {
		st.add(i);
	}
	private int pop(){
		if (st.size() == 0) return -1;
		int i = st.get(st.size() - 1);
		st.remove(st.size() - 1);
		return i;
	}
	public boolean processBracket(char c) {
		switch (c) {
		case '(':
			this.push(0);
			return true;
		case '[':
			this.push(1);
			return true;
		case ')':
			if (this.pop() == 0) return true;
			else return false;
		case ']':
			if (this.pop() == 1) return true;
			else return false;
		default:
			return false;
		}
	}
}