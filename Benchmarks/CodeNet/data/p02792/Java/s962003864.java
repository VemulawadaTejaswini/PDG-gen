import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int result = 0;
		for (int i = 1; i <= 9; i++)
			for (int j = 1; j <= 9; j++) {
				result += num(N, i, j) * num(N, j, i);
			}
		System.out.println(result);
	}
 
	static int num(int max, int head, int tail) {
		int result = 0;
 
		for (int i = 1; i <= max; i++)
			if (i % 10 == tail && head(i) == head)
				result++;
 
		return result;
	}
 
	static int head(int i) {
		while (i > 9) {
			i /= 10;
		}
		return i;
	}
}