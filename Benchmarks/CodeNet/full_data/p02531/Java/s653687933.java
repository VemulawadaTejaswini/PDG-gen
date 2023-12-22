
import java.util.*;
public class Main {

	/*
	public void doIt(){
		Scanner sc = new Scanner(System.in);
		List<String> stack = new LinkedList<String>();
		while(true){
			String cmd = sc.next();
			if(cmd.equals("push")){
				String block = sc.next();
				stack.add(block);
			}
			else if(cmd.equals("pop")){
				System.out.println(stack.remove(stack.size() -1));
			}
			else if(cmd.equals("quit")){
				break;
			}
		}
	}
	*/

	public void doIt(){
		Scanner sc = new Scanner(System.in);

		String [][] stack = new String[1][1001];
		int [] pc = new int[1];
		while(true){
			String cmd = sc.next();
			if(cmd.equals("push")){
				String block = sc.next();
				stack[0][pc[0]] = block;
				pc[0]++;
			}
			else if(cmd.equals("pop")){
				if(pc[0] > 0){
					pc[0]--;
					System.out.println(stack[0][pc[0]]);
				}
			}
			else if(cmd.equals("move")){
				int from = sc.nextInt();
				int to = sc.nextInt();
				if(pc[from] > 0){
					stack[to][pc[to]] = stack[from][pc[from] - 1];
					pc[from]--;
					pc[to]++;
				}

			}
			else if(cmd.equals("quit")){
				break;
			}
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}