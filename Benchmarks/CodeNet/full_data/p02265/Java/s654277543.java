import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder output = new StringBuilder();
		
		int n = Integer.parseInt(input.readLine());
		
		Deque<Integer> List = new ArrayDeque<Integer>();
		
		for (int i = 0; i < n; i++) {
			
			String order = input.readLine();
			
			if(order.charAt(0) == 'i') { List.push(Integer.parseInt(order.substring(7))); }
			else if(order.charAt(6)=='F') { List.removeFirst(); }
			else if(order.charAt(6)=='L') { List.removeLast(); }
			else { List.remove(Integer.parseInt(order.substring(7))); }
		}
		
		output.append(List.poll());
		for(int num2 : List) { output.append(" ").append(num2); }
		System.out.println(output);
	}
}

