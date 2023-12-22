import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>(n);
		String com = stdIn.nextLine();
		for (int i = 0; i < n; i++) {
			com = stdIn.nextLine();
			if (com.substring(0, 6).equals("insert"))
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
		
		for (int i = 0; i < list.size(); i++) {
			if (i !=list.size() - 1)
				System.out.print(list.get(i) +" ");
			else 
				System.out.println(list.get(i));
		}
	}
	
	public static void insertKey(ArrayList<Integer> l, int x) {
		l.add(0, x);
	}
	
	public static void deleteKey(ArrayList<Integer> l, int x) {
		int xat = l.indexOf(x);
		if (xat != -1)
			l.remove(xat);
	}
	
	public static void deleteFirstMember(ArrayList<Integer> l) {
		l.remove(0);
	}
	
	public static void deleteLastMember(ArrayList<Integer> l) {
		l.remove(l.size() - 1);
	}
}