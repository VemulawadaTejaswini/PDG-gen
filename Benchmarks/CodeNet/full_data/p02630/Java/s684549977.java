import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Integer> list = new ArrayList();
		int N = Integer.parseInt(sc.next());

		for(int i=0;i<N; i++) {
			list.add(Integer.parseInt(sc.next()));
		}
		int Q = Integer.parseInt(sc.next());
		int s;
		int c;
		int total;
		int lastTime = 0;
		for(int i=0; i<Q; i++) {
			s = Integer.parseInt(sc.next());
			c = Integer.parseInt(sc.next());

			if(list.contains(s)) {
				for(int j=0;j<list.size();j++) {
					if(list.get(j) == s) {
						list.set(j, c);
					}
				}
				total = 0;
				for(Integer a:list) { total += a; }
				System.out.println(total);
				lastTime = total;
			} else {
				if(lastTime == 0) {
					total = 0;
					for(Integer a:list) { total += a; }
					System.out.println(total);
				} else {
					System.out.println(lastTime);
				}
			}
		}

	}
}
