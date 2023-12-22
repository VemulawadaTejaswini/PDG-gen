import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayDeque;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int n = Integer.parseInt(br.readLine());
		ArrayDeque<Integer> list = new ArrayDeque<Integer>();
		for (int i = 0; i < n; i++) {
			String com = br.readLine();
			if (com.charAt(0) == 'i')
				insertKey(list, Integer.parseInt(com.substring(7)));
			else {
				if (com.charAt(6) == ' ')
					deleteKey(list, Integer.parseInt(com.substring(7)));
				else if (com.charAt(6) == 'F')
					deleteFirstMember(list);
				else
					deleteLastMember(list);
			}
		}
		
		pw.print(list.poll());
		for (Integer element : list)
			pw.print(" "+element);
		pw.println();
		pw.close();
	}
	
	public static void insertKey(ArrayDeque<Integer> l, int x) {
		l.addFirst(x);
	}
	
	public static void deleteKey(ArrayDeque<Integer> l, int x) {
		l.removeFirstOccurrence(x);
	}
	
	public static void deleteFirstMember(ArrayDeque<Integer> l) {
		l.removeFirst();
	}
	
	public static void deleteLastMember(ArrayDeque<Integer> l) {
		l.removeLast();
	}
}