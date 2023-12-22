import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long target;
		LinkedList<Long> list = new LinkedList<Long>();
		while(n-->0){
			switch(sc.next()){
				case "insert":
					list.addFirst(sc.nextLong());
					break;
				case "delete":
					target = sc.nextLong();
					if(list.indexOf(target)!=-1){
						list.remove(list.indexOf(target));
					}
					break;
				case "deleteFirst":
					list.pollFirst();
					break;
				case "deleteLast":
					list.pollLast();
			}
		}
		for(long l : list){
			System.out.print(l+" ");
		}
                System.out.println();
	}
}
