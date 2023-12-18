import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		ArrayList<Integer> rods = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			rods.add(sc.nextInt());
		}
		Collections.sort(rods);

		int a = 0;
		int b = 0;
		boolean flag = true;
		for(int i = rods.size() - 1; i >= 0; i--) {
			if(a == rods.get(i)) {
				rods.remove(i+1);
				rods.remove(i);
				flag = false;
				break;
			} else {
				a = rods.get(i);
			}
		}

		if(flag) {
			a = 0;
		}
		flag = true;

		for(int i = rods.size() - 1; i >= 0; i--) {
			if(b == rods.get(i)) {
				rods.remove(i+1);
				rods.remove(i);
				flag = false;
				break;
			} else {
				b = rods.get(i);
			}
		}
		if(flag) {
			b = 0;
		}

		System.out.println(a * b);

	}
}