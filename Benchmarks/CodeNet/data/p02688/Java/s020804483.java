
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());

		List<Integer> s = new ArrayList();

		for(int i = 0; i < N;i++) {
			s.add(0);
		}

		for(int i = 0;i < K;i++) {
			int ii = Integer.parseInt(sc.next());
			for(int r = 0;r < ii; r++) {
				int c = Integer.parseInt(sc.next()) -1;
				int b = s.get(c);
				s.set(c, ++b);
			}
		}

		int aa = 0;
		for(Integer a : s) {
			if(a == 0) aa++;

		}

		System.out.println(aa);


	}
}