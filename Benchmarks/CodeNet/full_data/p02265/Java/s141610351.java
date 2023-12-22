
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		for (int i=0; i<size; i++) {
			String ops = sc.next();
			if ("insert".equals(ops))
				ll.add(sc.nextInt());
			else if ("delete".equals(ops))
				ll.remove(ll.indexOf(sc.nextInt()));
			else if ("deleteFirst".equals(ops))
				ll.removeFirst();
			else if ("deleteLast".equals(ops))
				ll.removeLast();
			
		}
		sc.close();
		int i=0, llsize=ll.size();
		while (i<llsize) {
			if (i==llsize-1) System.out.println(ll.get(i));
			else System.out.print(ll.get(i) + " ");
			i ++;
		}
	}

}

