import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		int maxAbsIndex = 0;
		int tmpMax = 0;
		for (int i = 0; i < n; i++) {
			tmpMax = Math.max(Math.abs(a[i]), maxAbsIndex);
			if (Math.abs(a[i]) >= tmpMax) {
				maxAbsIndex = i;
			}

		}

		List<Answer> ans = new ArrayList<>();
		if (a[maxAbsIndex] < 0) {
			for (int i = 0; i < n; i++) {
				if (i != maxAbsIndex) {
					a[i] = a[i] + a[maxAbsIndex];
					ans.add(new Answer(maxAbsIndex, i));
				}
			}
			for (int i = n - 1; i >= 1; i--) {
				if (a[i] < a[i - 1]) {
					a[i - 1] = a[i - 1] + a[i];
					ans.add(new Answer(i, i - 1));
					i++;
				}
			}
		} else if (a[maxAbsIndex] > 0) {
			for (int i = 0; i < n; i++) {
				if (i != maxAbsIndex) {
					a[i] = a[i] + a[maxAbsIndex];
					ans.add(new Answer(maxAbsIndex, i));
				}
			}
			for (int i = 0; i < n - 1; i++) {
				if (a[i] > a[i + 1]) {
					a[i + 1] = a[i] + a[i + 1];
					ans.add(new Answer(i, i + 1));
					i--;
				}
			}
		}
		System.out.println(ans.size());
		for (Answer answer : ans) {
			System.out.print(answer.getFrom());
			System.out.print(" ");
			System.out.println(answer.getTo());
		}
	}
}

class Answer {
	private int from;
	private int to;
	public Answer(int from, int to) {
		this.from = from;
		this.to = to;
	}
	public int getFrom() {
		return from;
	}
	public int getTo() {
		return to;
	}
}