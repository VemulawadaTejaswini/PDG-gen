import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		LinkedList<Integer> list= new LinkedList<Integer>();

		for (int i=0; i<n; i++) {
			String str = stdIn.next();

			if (str.equals("insert")) {
				list.addFirst(stdIn.nextInt());
			}else if (str.equals("delete")) {
				list.remove((Integer)stdIn.nextInt());
			}else if (str.equals("deleteFirst")) {
				list.removeFirst();
			}else {
				list.removeLast();
			}
		}
		
		while (list.size() != 1) {
			System.out.print(list.removeFirst()+" ");
		}
		System.out.println(list.removeFirst());

		stdIn.close();
	}
}