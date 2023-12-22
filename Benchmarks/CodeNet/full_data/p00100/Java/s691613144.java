import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while ((scan.hasNext())) {
			int listNum = scan.nextInt();
			SaleResult[] saleResultList = new SaleResult[listNum];

			boolean is1000000 = false;

			for (int i = 0; i < listNum; i++) {
				saleResultList[i] = new SaleResult(scan.nextInt(),
						scan.nextInt(), scan.nextInt());
			}

			for (SaleResult saleResult : saleResultList) {
				if (saleResult.totalSales1000000) {
					is1000000 = true;
					System.out.println(saleResult.ID);
				}
			}

			if (is1000000) {
				System.out.println("NA");
			}
		}
	}

}

class SaleResult {
	int ID;
	int amountOfSales;
	int unitPrice;

	boolean totalSales1000000;

	SaleResult(int ID, int amountOfSales, int unitPrice) {
		this.ID = ID;
		this.amountOfSales = amountOfSales;
		this.unitPrice = unitPrice;

		this.totalSales1000000 = amountOfSales * unitPrice >= 1000000 ? true
				: false;

	}

}