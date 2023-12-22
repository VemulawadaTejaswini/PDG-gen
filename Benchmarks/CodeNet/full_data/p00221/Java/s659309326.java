
import java.util.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int n, m;
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			n = sc.nextInt();
			m = sc.nextInt();
			if((n|m) == 0) break;
			LinkedList<Integer> player = new LinkedList<Integer>();
			for(int i=1;i<=n;i++)player.addLast(i);
			Iterator<Integer> p = player.iterator();
			for(int i=1;i<=m;i++) {
				String s = sc.next();
				if(!p.hasNext()) p = player.iterator();
				p.next();
				if(player.size() == 1) continue;
				if(i%15 == 0 && s.equals("FizzBuzz"));
				else if(i%5 == 0 && s.equals("Buzz"));
				else if(i%3 == 0 && s.equals("Fizz"));
				else if(i%3 != 0 && i%5 != 0 && s.equals("" + i));
				else {
//					System.out.println(s + " " + s.equals("" + i));
					p.remove();
				}
			}
			System.out.print(player.removeFirst());
			for(int i: player) {
				System.out.print(" " + i);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}