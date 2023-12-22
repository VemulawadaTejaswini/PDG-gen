import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		Deque<Integer> Q = new ArrayDeque<>(2000000);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			int a;
			if(s.equals("insert")) {
				a = sc.nextInt();
				Q.addFirst(a);
			}
			else if(s.equals("delete")) {
				a = sc.nextInt();
				Q.remove(a);
			}
			else if(s.equals("deleteFirst")) {
				Q.pollFirst();
			}
			else if(s.equals("deleteLast")) {
					Q.pollLast();
			}	
		}

        boolean first = true;
        for(int i : Q){
            System.out.print((first ? "" : " ") + i);
             
            if(first){
                first = false;
            }
        }
        System.out.println();

		sc.close();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
