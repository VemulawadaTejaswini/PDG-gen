import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = Integer.parseInt(sc.next());
		ArrayList<Integer> integers = new ArrayList<Integer>(count);
		for (int i = 0; i < count; i++) {
			integers.add(Integer.parseInt(sc.next()));
		}
		int left = 0;
		int right = 0;
		for (int i = 0; i < count; i++) {
			if (right <= left) {
				int size = integers.size() - 1;
				right += integers.get(size);
				integers.remove(size);
			} else {
				left += integers.get(0);
				integers.remove(0);
			}
		}

		if(right>=left) {
			System.out.println(right-left);
		}else {
			System.out.println(left-right);
		}
		sc.close();
	}
}
