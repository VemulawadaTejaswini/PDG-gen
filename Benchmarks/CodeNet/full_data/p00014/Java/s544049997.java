import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d, x, area = 0;
		while (sc.hasNext()) {
			d = sc.nextInt();
			for (int i = 0; i < 600; i += d) {
				x = i * i;
				area += x * d;
			}
			System.out.println(area);
		}
	}
}