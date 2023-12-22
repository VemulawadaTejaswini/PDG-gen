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
		for(int i=0; i<Q; i++) {
			int s = Integer.parseInt(sc.next());
			int c = Integer.parseInt(sc.next());

			if(list.contains(s)) {
				for(int j=0;j<list.size();j++) {
					if(list.get(j) == s) {
						list.set(j, c);
					}
				}
			}

			int total= 0;
			for(Integer a:list) { total += a; }
			System.out.println(total);
		}

	}
}
