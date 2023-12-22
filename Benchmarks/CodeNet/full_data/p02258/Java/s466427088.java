import java.util.Scanner;

public class Main {
	
	int[] currency;
	int[] minCurrency;
	int maxProfit;

	public static void main(String[] args) {
		Main main = new Main();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		main.currency = new int[n];
		main.minCurrency = new int[n];
		for (int i = 0; i < n; i++) {
			main.currency[i] = in.nextInt();
		}
		main.maxProfit = main.currency[1] - main.currency[0];
		if (main.currency[0] < main.currency[1]) {
			main.minCurrency[0] = main.currency[0];
		} else {
			main.minCurrency[0] = main.currency[1];
		}
		for (int i = 2; i < n; i++) {
			main.setMins(i);
		}
		System.out.println(main.maxProfit);
	}
	
	public void setMins(int index) {
		int min = this.minCurrency[index - 2];
		this.maxProfit = (currency[index] - min > maxProfit)? currency[index] - min : maxProfit;
		this.minCurrency[index - 1] = (this.currency[index] < min)? this.currency[index] : min;
	}

	public void printList(int[] list) {
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}
	
}

