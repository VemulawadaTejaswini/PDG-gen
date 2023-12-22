import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		List<Integer> sales = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int x = sc.nextInt();
			if (x == 0) {
				System.out.println(sales.get(sales.size()-1));
				sales.remove(sales.size() - 1);
			}else {
			sales.add(x);
			}
		}
	}
}

