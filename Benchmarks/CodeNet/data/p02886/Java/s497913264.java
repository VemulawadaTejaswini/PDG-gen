import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		List<Integer> list = new ArrayList();
		for(int i=0;i<N; i++) {
			list.add(Integer.parseInt(sc.next()));
		}
		int total = 0;

		for(int i=0; i<N-1; i++) {
			for(int j=i+1; j<N; j++) {
				total += list.get(i) * list.get(j);
			}
		}
		System.out.println(total);

	}
}
