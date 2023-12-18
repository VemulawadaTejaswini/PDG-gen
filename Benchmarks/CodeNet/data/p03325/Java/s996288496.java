import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int[] list = {Integer.parseInt(sc.next())};
		System.out.println(threeOrTwo(n, list));
		sc.close();
	}

	public static int threeOrTwo(int n, int[] list) {
		int count = 0;
		while (true) {
			int even = 0;
			for (int i = 0; i < n; i++) {
				if (list[i] % 2 == 0) {
					list[i] = list[i] / 2;
					even++;
					break;
				} 
			}
			if (even ==  0) {
				return count;
			} else {
				count++;
			}
		}
	}
}