import java.io.*;
import java.util.ArrayDeque;
public class Main{
    public static void main(String[] args) throws IOException{
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(reader.readLine());
	ArrayDeque<Integer> list = new ArrayDeque<Integer>();
	String input;
	for (int i = 0; i < n; i++) {
	    input  = reader.readLine();
	    if (input.equals("deleteFirst")) {
		list.removeFirst();
	    } else if (input.equals("deleteLast")) {
		list.removeLast();
	    } else {
		if (input.startsWith("insert")) {
		    list.addFirst(Integer.parseInt(input.substring(7)));
		} else if (input.startsWith("delete")) {
		    list.remove(Integer.parseInt(input.substring(7)));
		}
	    }
	}
	System.out.print(list.poll());
	for (int i = 0; i < list.size(); i++) {
	    System.out.print(" " + list.poll());
	}
    }
}