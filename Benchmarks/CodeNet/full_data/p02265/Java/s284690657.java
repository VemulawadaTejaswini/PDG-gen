import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		LinkedList<Integer> list=new LinkedList<>();
		for(int i=0;i<n;i++) {
			String str=cin.next();
			if(str.equals("insert")) {
				int x=cin.nextInt();
				list.addFirst(x);
			}
			else if(str.equals("delete")) {
				int x=cin.nextInt();
				list.removeFirstOccurrence(x);
			}
			else if(str.equals("deleteFirst"))list.removeFirst();
			else if(str.equals("deleteLast"))list.removeLast();
		}
		
		int lim=list.size();
		for(int i=0;i<lim;i++) {
			if(i==lim-1)System.out.println(list.remove());
			else System.out.print(list.remove()+" ");
		}
	}

}

