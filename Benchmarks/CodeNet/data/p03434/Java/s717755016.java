import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}
		list.sort(Comparator.reverseOrder());
		int a = 0;
		int b = 0;
		for(int i = 0; i < list.size(); i++) {
			if(i % 2 == 0) {
				a += list.get(i);
			} else {
				b += list.get(i);
			}
		}
		System.out.println(a - b);
	}

}
