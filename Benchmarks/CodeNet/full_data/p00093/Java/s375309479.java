
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		while(true) {
			LinkedList<Integer> ans = new LinkedList<Integer>();
			for(int i=a;i<=b;i++) {
				if(i%400 == 0) ans.add(i);
				else if(i%100 != 0 && i%4 == 0) ans.add(i);
			}
			if(ans.isEmpty()) System.out.println("NA");
			else {
				for(int i:ans) {
					System.out.println(i);
				}
			}
			a = sc.nextInt();
			b = sc.nextInt();
			if( a == 0 && b == 0) break;
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}