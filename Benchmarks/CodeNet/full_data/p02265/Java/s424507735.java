package aojtest;

import java.util.*;
public class Main {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s;
		int v;
		Deque<Integer> list = new LinkedList<Integer>();
		for(int i = 0; i < n; i++) {
			s = sc.next();
			if(s.equals("insert")) {
				v = sc.nextInt();
				list.offerFirst(v);
			} else if(s.equals("delete")) {
				v = sc.nextInt();
				list.remove((Object) v);
			} else if(s.equals("deleteFirst")) {
				list.removeFirst();
			} else if(s.equals("deleteLast")) {
				list.removeLast();
			}
		}
		Iterator it = list.iterator();
		for(int i = 0; i < list.size() - 1; i++) {
			System.out.printf("%d ", it.next());
		}
		System.out.println(it.next());
	}
}