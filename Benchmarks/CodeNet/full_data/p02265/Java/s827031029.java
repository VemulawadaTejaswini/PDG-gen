package Lecture3;
import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	StringBuilder output = new StringBuilder();
	
	Deque<Integer> List = new ArrayDeque<Integer>();
	
	int n;
	String order;
	int data;
	
	public void input() {
		n = sc.nextInt();
		for(int i=0; i<n; i++) {
			order = sc.next();
			
			if( order.equals("insert") ) {
				data = sc.nextInt();
				List.addFirst(data);
				
			}else if( order.equals("delete") ) {
				data = sc.nextInt();
				List.remove(data);
			}
			
			else if( order.equals("deleteFirst") ) {List.removeFirst();}
			else{List.removeLast();}
		}
	}
	
	public void output() {
		output.append( List.poll() );
		for(int ans : List) {
			output.append(" ").append(ans);
		}
		System.out.println(output);
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.input();
		obj.output();
	}
}

