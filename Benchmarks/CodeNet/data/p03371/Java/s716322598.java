import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int aPrice = stdIn.nextInt();
		int bPrice = stdIn.nextInt();
		int abPrice = stdIn.nextInt();

		int aNeeds = stdIn.nextInt();
		int bNeeds = stdIn.nextInt();

		// 全部ハーフで買う枚数
		int halfAll = Integer.max(aNeeds, bNeeds) * 2;
		int priceAllHalf = halfAll * abPrice;

		// 共通部分はハーフで買う
		int halfCommon = Integer.min(aNeeds, bNeeds) * 2;
		int rest = Math.abs(aNeeds - bNeeds);
		int priceHalfCommon = (halfCommon * abPrice) + (aNeeds > bNeeds ? rest * aPrice : rest * bPrice);

		// 全部別々に買う
		int priceSimply = aPrice * aNeeds + bPrice * bNeeds;
		stdIn.close();


		System.out.println(Integer.min(Integer.min(priceAllHalf, priceHalfCommon),priceSimply));
	}

}
