import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	StringBuilder output = new StringBuilder();
	
	Deque<Integer> List = new ArrayDeque<Integer>();
	
	int n;
	String order;
	
	public void input() {
		n = sc.nextInt();
		for(int i=0; i<n; i++) {
			if( sc.next().equals("insert") ) {
				List.addFirst(sc.nextInt());
			}else if( sc.next().equals("delete") ) {
				List.remove(sc.nextInt());
			}
			else if( sc.next().equals("deleteFirst") ) {List.removeFirst();}
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

