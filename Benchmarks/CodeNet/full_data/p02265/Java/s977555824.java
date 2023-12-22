import java.util.*;
import static java.lang.System.*;
import java.io.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws IOException{
		int n = sc.nextInt();
		LinkedList<Integer> list = new LinkedList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		for (int i=0; i<n; i++) {
			str = br.readLine();
			
			if (str.startsWith("insert")) {
				list.addFirst(Integer.parseInt(str.substring(str.indexOf(" ")+1)));
			}
			else if (str.equals("deleteFirst")) {
				list.pollFirst();
			}
			else if (str.equals("deleteLast")) {
				list.pollLast();
			}
			else {
				list.remove(Integer.parseInt(str.substring(str.indexOf(" ")+1)));
			}
		}
		StringBuilder sb = new StringBuilder();
		sb.append(list.poll());
		for (Integer s: list) {
			sb.append(" ");
			sb.append(s);
		}
		out.println(sb);
	}
}
