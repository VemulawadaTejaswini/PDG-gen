import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Card {
	final private String str;
	final private int number, id;
	public Card(String str, int id) {
		super();
		this.str = str;
		this.number = Integer.parseInt(str.substring(2));
		this.id = id;
	}
	public final int getNumber() {
		return number;
	}
	public final int getId() {
		return id;
	}
	@Override
	public final String toString() {
		return str;
	}

}


public class Main {

	private static void swap(Card[] arr, int a, int b) {
		Card c = arr[a];
		arr[a] = arr[b];
		arr[b] = c;
	}

	private static int partition(Card[] arr, int p, int r) {
		Card x = arr[r];
		int i = p - 1;
		for (int j = p; j < r; j++) {
			if (arr[j].getNumber() <= x.getNumber()) {
				swap(arr, ++i, j);
			}
		}
		swap(arr, ++i, r);
		return i;
	}
	private static void quickSort(Card[] arr, int p, int r) {
		if (p >= r) return;
		int q = partition(arr, p, r);
		quickSort(arr, p, q - 1);
		quickSort(arr, q + 1, r);
	}
	private static boolean isStable(Card[] arr) {
		for (int i = 0, n = arr.length; i < n - 1; i++) {
			if (arr[i].getNumber() == arr[i + 1].getNumber() &&
					arr[i].getId() > arr[i + 1].getId()) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args)  {
		try(BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));) {
			int n = Integer.parseInt(br.readLine());
			StringBuilder sb = new StringBuilder();
			Card[] arr = new Card[n];
			for (int i = 0; i < n; i++) {
				arr[i] = new Card(br.readLine(), i);
			}
			quickSort(arr, 0, n - 1);
			sb.append(isStable(arr) ? "Stable\n" : "Not stable\n");
			for (int i = 0; i < n; i++) {
				sb.append(arr[i]).append('\n');
			}
			System.out.print(sb);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
