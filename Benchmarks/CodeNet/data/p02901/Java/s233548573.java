import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();

		String[] stringArray = str1.split(" ");

		int chestCount = Integer.parseInt(stringArray[0]);
		int keyCount = Integer.parseInt(stringArray[1]);

		List<Key> keyList = new ArrayList<>();

		for (int i = 0; i < keyCount; i++) {

			Key keytemp = new Key();

			String strTemp1 = scan.nextLine();
			String[] stringTemp1Array = strTemp1.split(" ");

			keytemp.price = Integer.parseInt(stringTemp1Array[0]);
			keytemp.rawPrice = keytemp.price;

			String strTemp2 = scan.nextLine();

			keytemp.openNumbers = Arrays.stream(strTemp2.split(" "))
					.mapToInt(Integer::parseInt)
					.toArray();

			keyList.add(keytemp);
		}

		// １から宝箱を順番に
		for (int i = 1; i <= chestCount; i++) {

			final int chestNumber = i;

			// 宝箱を開けれる鍵の中で、一番安いものの金額を、開けれる鍵の金額から引く
			Optional<Key> optionalBestKey = keyList.stream()
					.filter(k -> k.canOpen(chestNumber))
					.min(Comparator.comparingInt(k -> k.price));

			if (optionalBestKey.isPresent()) {

				final int decrementNumber = optionalBestKey.get().price;

				keyList.stream()
						.filter(k -> k.canOpen(chestNumber))
						.forEach(k -> k.decrementPrice(decrementNumber));

			} else {
				System.out.println("-1");
				return;
			}
		}

		// 金額が 0 になった鍵のみ残す
		keyList = keyList.stream()
				.filter(k -> k.price == 0)
				.map(k -> k.revival())
				.collect(Collectors.toList());

		// 宝箱の数から１ずつ減らしていく
		for (int i = chestCount; i >= 1; i--) {

			final int chestNumber = i;

			// 宝箱を開けれる鍵の中で、一番安いものの金額を、開けれる鍵の金額から引く
			Optional<Key> optionalBestKey = keyList.stream()
					.filter(k -> k.canOpen(chestNumber))
					.min(Comparator.comparingInt(k -> k.price));

			final int decrementNumber = optionalBestKey.get().price;

			keyList.stream()
					.filter(k -> k.canOpen(chestNumber))
					.forEach(k -> k.decrementPrice(decrementNumber));
		}

		// 金額が 0 になった鍵のみ残す
		keyList = keyList.stream()
				.filter(k -> k.price == 0)
				.collect(Collectors.toList());

		long resultPrice = 0;

		for (Key key : keyList) {

			resultPrice = resultPrice + key.rawPrice;
		}

		System.out.println(resultPrice);
	}

	public static class Key {
		public int rawPrice;
		public int price;
		public int[] openNumbers;

		public boolean canOpen(int chestNumber) {

			for (int openNumber : this.openNumbers) {

				if (openNumber == chestNumber) {
					return true;
				}
			}

			return false;
		}

		public void decrementPrice(int decrementNumber) {

			this.price = this.price - decrementNumber;
		}

		public Key revival() {

			this.price = this.rawPrice;
			return this;
		}

		public String toString() {
			return ("price:" + this.price + "openNumbers:" + Arrays.toString(this.openNumbers));
		}
	}
}
