import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		int len = Integer.parseInt(s);
		
		int[] numbers = new int[len];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}
		
		Main solution = new Main();
		int ans = 0;
		while (solution.checkEven(numbers)) {
			ans++;
			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = numbers[i]/2;
			}
		}
		
		System.out.println(ans);
		
		scanner.close();
	}

	public int forwardCount(int[] numbers) {
		int res = 0;
		for (int i : numbers) {
			if (i % 2 == 0) {
				res++;
			}else{
				break;
			}
		}
		return res;
	}

	public boolean checkEven(int[] numbers) {
		boolean b = true;
		for (int i : numbers) {
			if (i % 2 != 0) {
				b = false;
			}
		}
		return b;
	}

}