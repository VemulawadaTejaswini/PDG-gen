import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		String command;
		int value,temp;
		List<Integer> list = new LinkedList<>();
		for (int i=0; i<n; i++) {
			command = sc.next();
			if (command.equals("insert")) {
				value = sc.nextInt();
				list.add(0,value);
			}
			else if (command.equals("delete")) {
				value = sc.nextInt();
				temp = list.indexOf(value);
				if (temp != -1) {list.remove(list.indexOf(value));}
			}
			else if (command.equals("deleteFirst")) {
				list.remove(0);
			}
			else if (command.equals("deleteLast")) {
				list.remove(list.size()-1);
			}
			
//			for (int k=0; k<list.size(); k++) {
//				out.print((k==0?"":" ")+list.get(k));
//			}
//			out.println();
		}
		for (int i=0; i<list.size(); i++) {
			out.print((i==0?"":" ")+list.get(i));
		}
		out.println();
	}
}
