import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		int zahyo = 0;
		int num = 0;
		for (int i = 0; i < n; i++) {
			zahyo += list.get(i);
			if (zahyo > x) {
				break;
			} else {
				num++;
			}
		}
		System.out.println(num + 1);
	}
}