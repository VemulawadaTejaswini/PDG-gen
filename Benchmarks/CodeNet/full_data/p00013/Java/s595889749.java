import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	private LinkedList<Integer> stack;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		stack = new LinkedList<Integer>();
		
		while (sc.hasNext() == true) {
			int inst = Integer.parseInt(sc.next());
			
			if (inst == 0) {
				System.out.println(stack.pop());
			} else {
				stack.push(inst);
			}
		}
	}
}