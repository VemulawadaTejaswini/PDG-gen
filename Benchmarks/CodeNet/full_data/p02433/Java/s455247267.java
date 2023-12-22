import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedList<Integer> list = new LinkedList<>();
		ListIterator<Integer> it = list.listIterator();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
		    int type = sc.nextInt();
		    if (type == 0) {
		        it.add(sc.nextInt());
		        it.previous();
		    } else if (type == 1) {
		        int x = sc.nextInt();
		        if (x > 0) {
		            while(x > 0) {
		                it.next();
		                x--;
		            }
		        } else {
		            while (x < 0) {
		                it.previous();
		                x++;
		            }
		        }
		    } else {
		        it.next();
		        it.remove();
		    }
		}
		for (int x : list) {
		    sb.append(x).append("\n");
		}
		System.out.print(sb);
	}
}

