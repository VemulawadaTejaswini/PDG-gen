import java.util.*;
import java.io.*;
public class Main {
	StringBuilder output = new StringBuilder();
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	
	Deque<Integer> List = new ArrayDeque<Integer>();
	
	int n;
	String order;
	int data;
	
	public void input() throws NumberFormatException, IOException {
		n = Integer.parseInt(input.readLine());
		for(int i=0; i<n; i++) {
			order = input.readLine();
			if( order.charAt(0) == 'i' ) {
				data = Integer.parseInt(order.substring(7));
				List.addFirst(data);
			}else if( order.charAt(0) == 'd' ) {
				data = Integer.parseInt(order.substring(7));
				List.remove(data);
			}
			else if( order.charAt(6) == 'F' ) {List.removeFirst();}
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

