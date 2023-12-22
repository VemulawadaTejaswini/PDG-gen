
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		for(;;){
			String buf = sc.nextLine();
			if(".".equals(buf)){
				break;
			}
			System.out.println(solve(buf)?"yes":"no");
		}
	}
	
	
	boolean solve(String s){
		String left = "[(";
		String right = "])";
		
		Stack<Integer> open = new Stack<Integer>(); 
		for(char ch: s.toCharArray()){
			int l = left.indexOf(ch);
			int r = right.indexOf(ch);

			if(l >= 0) open.push(l);
			if(r >= 0 && open.isEmpty()) return false;
			if(r >= 0 && open.pop() != r) return false;
		}
		return open.isEmpty();
	}	
}

