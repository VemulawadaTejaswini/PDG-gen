

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 出力用変数を用意
		StringBuilder out = new StringBuilder();

		// 入力値がある限りまわす
		while (sc.hasNext()) {

			/**
			 * すべてのビデオを入れるリスト
			 */
			ArrayList<Video> allVideoList = new ArrayList<Video>();

			// 新作、準新作、旧作の料金。セット料金の本数、料金を取得
			int newPrice = sc.nextInt();
			int normalPrice = sc.nextInt();
			int oldPrice = sc.nextInt();
			int setCount = sc.nextInt();
			int setPrice = sc.nextInt();

			// 上記の入力値が０の場合は標準入力を終え、出力へ
			if (newPrice == 0 && normalPrice == 0 && oldPrice == 0
					&& setCount == 0 && setPrice == 0) {
				break;
			}

			// それぞれのビデオの本数を取得
			int newCount = sc.nextInt();
			int normalCount = sc.nextInt();
			int oldCount = sc.nextInt();

			// 入力値に従い、旧作のインスタンスを作る
			for (int obj_count = 0; obj_count < oldCount; obj_count++) {
				Video Video = new Video(oldPrice, "旧作");
				// ビデオのリストに追加
				allVideoList.add(Video);
			}

			// 入力値に従い、新作ビデオのインスタンスを作る
			for (int obj_count = 0; obj_count < newCount; obj_count++) {
				Video Video = new Video(newPrice, "新作");
				// ビデオのリストに追加
				allVideoList.add(Video);
			}

			// 入力値に従い、準新作のインスタンスを作る
			for (int obj_count = 0; obj_count < normalCount; obj_count++) {
				Video Video = new Video(normalPrice, "準新作");
				// ビデオのリストに追加
				allVideoList.add(Video);
			}

			// ビデオを高い順に並べる
			Collections.sort(allVideoList, new VideoComparator());
			Collections.reverse(allVideoList);

			// セット料金、最低本数を記憶
			Set set = new Set();
			set.setSetPrice(setPrice);
			set.setSetCount(setCount);

			// 最適なセット料金を適用
			PriceMath pm = new PriceMath();
			int mostDiscountPrice = pm.mostDiscountPrice(allVideoList, set);

			// 出力文字列に追加
			out.append(mostDiscountPrice + "\n");
		}

		// 結果を出力
		System.out.print(out);

	}
}

/** ビデオクラス */
class Video {

	/** 料金 */
	private int rentalPrice = 0;

	/**
	 * rentalPriceを取得する
	 * 
	 * @return rentalPrice
	 */
	public int getRentalPrice() {
		return rentalPrice;
	}

	/**
	 * rentalPriceをセットする
	 * 
	 * @param rentalPrice
	 */
	public void setRentalPrice(int rentalPrice) {
		this.rentalPrice = rentalPrice;
	}

	/** 種類 */
	private String kindOfVideo = "";

	/**
	 * kindOfVideoを取得する
	 * 
	 * @return kindOfVideo
	 */
	public String getKindOfVideo() {
		return kindOfVideo;
	}

	/**
	 * kindOfVideoをセットする
	 * 
	 * @param kindOfVideo
	 */
	public void setKindOfVideo(String kindOfVideo) {
		this.kindOfVideo = kindOfVideo;
	}

	/**
	 * 
	 * @param 料金
	 *            　price
	 * @param ビデオの種類
	 *            　val
	 */
	Video(int price, String kindOfVideo) {
		this.rentalPrice = price;
		this.kindOfVideo = kindOfVideo;
	}
}

/**
 * セットに関するクラス
 * 
 * @author Admin
 * 
 */
class Set {
	/** セット料金 */
	private int setPrice = 0;

	/**
	 * setPriceを取得する
	 * 
	 * @return setPrice
	 */
	public int getSetPrice() {
		return setPrice;
	}

	/**
	 * setPriceをセットする
	 * 
	 * @param setPrice
	 */
	public void setSetPrice(int setPrice) {
		this.setPrice = setPrice;
	}

	/** セット料金を適用できる最低本数 */
	private int setCount = 0;

	/**
	 * setCountを取得する
	 * 
	 * @return setCount
	 */
	public int getSetCount() {
		return setCount;
	}

	/**
	 * setCountをセットする
	 * 
	 * @param setCount
	 */
	public void setSetCount(int setCount) {
		this.setCount = setCount;
	}
}

/**
 * 料金を計算をするクラス
 * @author Admin
 *
 */
class PriceMath {

	/** 最適な料金を適用した金額 */
	int mostDiscountPrice = 0;

	/**
	 * 借りるビデオのリストから、最適な料金を出す
	 * 
	 * @param すべてのビデオ
	 *            all
	 * @return 最安値　DiscountPrice
	 */
	public int mostDiscountPrice(ArrayList<Video> all, Set set) {
		int useSetPrice = 0;
		int noUseSetPrice = 0;

		// 並んでいるビデオから、セット適用最低本数分をビデオ料金が高い順に取り出し、セット料金を適用した金額と通常の金額を出す。
		for (int i = 0; i < set.getSetCount(); i++) {

			useSetPrice += set.getSetPrice();
			noUseSetPrice += all.get(i).getRentalPrice();
		}

		// セット料金を適用した場合としなかった場合を比較
		// セット料金適用のほうが安かった場合
		if (noUseSetPrice > useSetPrice) {

			// 現在セット料金を適用しているビデオを会計金額に追加
			mostDiscountPrice = useSetPrice;

			// セットを適用していないビデオの中で、現在一番料金の高いビデオとセット料金を比較し、セット料金が安い間はセット料金を適用し続ける
			for (int i = set.getSetCount(); i < all.size(); i++) {
				if (all.get(i).getRentalPrice() >= set.getSetPrice()) {
					mostDiscountPrice += set.getSetPrice();
				} else {
					// セット料金のほうが高くなった場合はビデオ料金を適用
					mostDiscountPrice += all.get(i).getRentalPrice();
				}
			}
		} else {

			// セット料金適用のほうが高かった場合
			// 通常料金を適用
			for (Video video : all) {
				mostDiscountPrice += video.getRentalPrice();
			}
		}

		// 合計金額を返す
		return mostDiscountPrice;
	}

	/**
	 * mostDiscountPriceを取得する
	 * 
	 * @return mostDiscountPrice
	 */
	public int getMostDiscountPrice() {
		return mostDiscountPrice;
	}

	/**
	 * mostDiscountPriceをセットする
	 * 
	 * @param mostDiscountPrice
	 */
	public void setMostDiscountPrice(int mostDiscountPrice) {
		this.mostDiscountPrice = mostDiscountPrice;
	}

}

/**
 * ビデオを昇順（料金の安い順）に並べるクラス
 * @author Admin
 *
 */
class VideoComparator implements Comparator<Video> {

	public int compare(Video s, Video t) {
		// 比較する数

		// 昇順で結果を返す
		if (s.getRentalPrice() > t.getRentalPrice()) {
			return 1;
		} else {
			return -1;
		}
	}
}