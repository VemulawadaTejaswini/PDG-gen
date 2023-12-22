import java.util.Scanner;
import java.util.Arrays;

// ALDS1_2_C
public class Main {
	boolean safetyJudge(String[] oldarray, String[] newarray) {
		for (int i = 1; i < newarray.length; i++) {
			if (newarray[i].charAt(1) != newarray[i-1].charAt(1)) continue;
			if (Arrays.asList(oldarray).indexOf(newarray[i]) < Arrays.asList(oldarray).indexOf(newarray[i-1]))
				return false;
		}
		return true;
	}

	String[] bubbleSort(String[] oldarray, int n) {
		String[] newarray = oldarray.clone();
		boolean flag = true;
		String tmp;
		while (flag) {
			flag = false;
			for (int j = n - 1; j > 0; j--) {
				if (newarray[j].charAt(1) - '0' < newarray[j-1].charAt(1) - '0') {
					tmp = newarray[j]; newarray[j] = newarray[j-1]; newarray[j-1] = tmp;
					flag = true;
				}
			}
		}
		return newarray;
	}

	String[] selectionSort(String[] oldarray, int n) {
		String[] newarray = oldarray.clone();
		int minj;
		String tmp;
		for (int i = 0; i < n; i++) {
			minj = i;
			for (int j = i; j < n; j++) {
				if (newarray[j].charAt(1) - '0'< newarray[minj].charAt(1) - '0') minj = j;
			}
			if (minj != i) {
				tmp = newarray[i]; newarray[i] = newarray[minj]; newarray[minj] = tmp;
			}
		}
		return newarray;
	}

	void print(String[] oldarray, String[] newarray) {
		for (int i = 0; i < newarray.length; i++) {
			System.out.print(newarray[i]);
			if (i < newarray.length - 1) System.out.print(" ");
		}
		System.out.println();
		if (safetyJudge(oldarray, newarray))
			System.out.println("Stable");
		else
			System.out.println("Not stable");
	}
	
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String str = sc.nextLine();
		String[] array = new String[n];
		array = str.split(" ", 0);
		String[] bsortarray = bubbleSort(array, n);
		String[] ssortarray = selectionSort(array, n);
		print(array, bsortarray); print(array, ssortarray);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
