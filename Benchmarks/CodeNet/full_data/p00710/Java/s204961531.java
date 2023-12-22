import java.util.*;
public class Main {
	Scanner sc;
	void run() {
		sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			int r = sc.nextInt();
			
			LinkedList<Integer> list = new LinkedList<Integer>();
			for (int i=0;i<n;i++) 
				list.add(i+1);
			for (int i=0;i<r;i++) {
				int p = sc.nextInt();
				int c = sc.nextInt();
				for (int j=0;j<c;j++) {
					list.addLast(list.remove(n-(p-1+c)));
				}
			}
			System.out.println(list.getLast());
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}