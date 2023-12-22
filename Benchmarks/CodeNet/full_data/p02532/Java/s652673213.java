import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		List <ArrayDeque<String>>deque = new ArrayList<ArrayDeque<String>>();
		for(int i = 0; i < n; i++) {
			deque.add(new ArrayDeque<String>());
		}
		
		
		
		while(true) {
			String inst = stdIn.next();
			if(inst.equals("push")) {
				int opA = stdIn.nextInt();
				String opB = stdIn.next();
				deque.get(opA-1).push(opB);
			}
			else if(inst.equals("move")) {
				int opA = stdIn.nextInt();
				int opB = stdIn.nextInt();
				deque.get(opB-1).push(deque.get(opA-1).pop());
			}
			else if(inst.equals("pop")) {
				int op = stdIn.nextInt();
				System.out.println(deque.get(op).pop());
			}
			else {
				break;
			}
		}
	}

}