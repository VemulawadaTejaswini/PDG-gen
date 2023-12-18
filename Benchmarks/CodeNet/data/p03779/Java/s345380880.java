import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();

		List<Integer> i = new ArrayList<>();
		List<Integer> x = new ArrayList<>();

		i.add(0);
		x.add(0);

		while(x.get(0) != X) {

			int t = i.get(0);
			i.remove(0);
			int p = x.get(0);
			x.remove(0);

			i.add(t+1);
			x.add(p - (t+1));

			i.add(t+1);
			x.add(p);

			i.add(t+1);
			x.add(p + (t+1));
		}
		System.out.println(i.get(0));
	}
}
