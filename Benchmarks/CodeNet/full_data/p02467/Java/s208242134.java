import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static int nowIndex = 0;
	private static ArrayList<Integer> array;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		setSosuu(n + 1);
		System.out.printf(n + ":");

		while(n != 1) {
			int sosuu = getNextSosuu();
			while(n % sosuu == 0) {
				System.out.printf(" %d", sosuu);

				n /= sosuu;
			}
		}
		System.out.println("");

		scan.close();
	}

	private static void setSosuu(int n) {
		array = new ArrayList<Integer>();

		int[] sosuu = new int[n];
		Arrays.fill(sosuu, 0);
		sosuu[0] = sosuu[1] = 0;

		int i = 2;
		while(i < Math.sqrt(n)) {
			array.add(i);
			int tmpI = i;
			while(tmpI < n) {
				sosuu[tmpI] = -1;
				tmpI += i;
			}

			while(sosuu[i] == -1) {
				i++;
			}
		}

		while(i < n) {
			if(sosuu[i] != -1) {
				array.add(i);
			}
			i++;
		}
	}

	private static int getNextSosuu() {
		if(nowIndex < array.size()) {
			return array.get(nowIndex++);
		}
		else {
			return -1;
		}
	}
}
