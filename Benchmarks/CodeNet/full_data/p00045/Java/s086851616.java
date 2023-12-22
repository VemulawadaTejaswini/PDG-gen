import java.util.ArrayList;
import java.util.Scanner;


class SaleData {
	private int price;
	private int amount;
	private int total;

	SaleData(int price, int amount){
		this.price = price;
		this.amount = amount;
		this.total = this.price * this.amount;
	}

	public int getAmount() {
		return amount;
	}

	public int getTotal() {
		return total;
	}
}

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		sum_and_average();
	}

	private static void sum_and_average() {
		ArrayList<SaleData> saledatas = new ArrayList<SaleData>();
		int sum = 0;
		int average = 0;

		while (sc.hasNext()) {
			String[] dat = sc.nextLine().split(",");
			saledatas.add( new SaleData(Integer.parseInt(dat[0]),
										Integer.parseInt(dat[1]) ) );
		}

		for (int i = 0; i < saledatas.size(); i++) {
			sum += saledatas.get(i).getTotal();
			average += saledatas.get(i).getAmount();
		}

		System.out.println(sum);
		System.out.println(average / saledatas.size());

	}

}
