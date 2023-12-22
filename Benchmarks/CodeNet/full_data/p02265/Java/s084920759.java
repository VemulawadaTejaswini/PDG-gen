import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Deque<Integer> d = new ArrayDeque<Integer>();
	
	int n = sc.nextInt();
	for(int i = 0; i < n; ++i) {
		String com = sc.next();
		int a;
		if(com.charAt(0) == 'i') {
			// insert
			a = sc.nextInt();
			d.addFirst(a);
		}else if(com.length() == 6) {
			// delete
			a = sc.nextInt();
			d.remove(a);
		}else if(com.charAt(6) == 'F') {
			// deleteFirst
			d.remove();
		}else{
			// deleteLast
			d.removeLast();
		}
	}
	
	int s = d.size();
	for(int i = 0; i < s; ++i) {
		System.out.print(i == 0 ? d.poll() : " " + d.poll());
	}
	System.out.println();
  }
}