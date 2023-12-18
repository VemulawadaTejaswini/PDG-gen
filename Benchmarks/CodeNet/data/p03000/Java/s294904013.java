import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int l = 0;
		int tempx = 0;
		int count = 1;
		for (int i = 0; i < n; i++) {
			l = sc.nextInt();
			tempx += l;
			if (x < tempx) {
				break;
			} else {
				count++;
			}
		}
		System.out.println(count);
		return;
	}
}