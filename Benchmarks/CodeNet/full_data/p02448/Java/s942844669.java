import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
//	入力値
	static Scanner scInputData = new Scanner(System.in);
//	配列
	static ArrayList<Product> arrProduct= new ArrayList<Product>();
	
	public static void main(String[] args) {
		
//		必要なパラメータを用意する処理
//		品物情報を取得する処理
		getProduct();
//		品物を所定の順でソートする処理
		compareProduct();
//		結果を出力する処理
		putResult();
	}
	
	private static void putResult() {
		for(Product pdt : arrProduct) {
			System.out.println(pdt.getPrice() + " " 
					+ pdt.getWeight() + " " 
					+ pdt.getPattern() + " " 
					+ pdt.getDate() + " " 
					+ pdt.getName());
		}
	}
	
	private static void compareProduct() {

		Collections.sort(arrProduct, new Comparator<Product> () {//価格でソート
			public int compare(Product pdt1, Product pdt2) {
				return Integer.compare(pdt1.getPrice(), pdt2.getPrice());
			}
		}.thenComparing(new Comparator<Product>() { //価格が同じ場合、重さでソート 
			public int compare(Product pdt1, Product pdt2) {
				return Integer.compare(pdt1.getWeight(), pdt2.getWeight());
			}
		}).thenComparing(new Comparator<Product>() { //重さが同じ場合、型でソート 
			public int compare(Product pdt1, Product pdt2) {
				return pdt1.getPattern().compareTo(pdt2.getPattern());
			}
		}).thenComparing(new Comparator<Product>() { //型が同じ場合、日時でソート 
			public int compare(Product pdt1, Product pdt2) {
				return Long.compare(pdt1.getDate(), pdt2.getDate());
			}
		}).thenComparing(new Comparator<Product>() { //日時が同じ場合、名前でソート 
			public int compare(Product pdt1, Product pdt2) {
				return pdt1.getName().compareTo(pdt2.getName());
			}
		}));
	}
	private static void getProduct() {
//		 品物の数
		int iProductNum = scInputData.nextInt();
		while(arrProduct.size() < iProductNum) {
			Product pdt = new Product(scInputData.nextInt(), 
					scInputData.nextInt(), 
					scInputData.next(), 
					scInputData.nextLong(), 
					scInputData.next());
			arrProduct.add(pdt);
		}
	}
//	品物情報を扱うクラス
	static class Product{
		int price, weight;
		long date;
		String pattern, name;
		public Product(int price, int weight, String pattern, long date, String name) {
			this.price = price;
			this.weight = weight;
			this.pattern = pattern;
			this.date = date;
			this.name = name;
		}
		int getPrice() {
			return price;
		}
		int getWeight() {
			return weight;
		}
		String getPattern() {
			return pattern;
		}
		long getDate() {
			return date;
		}
		String getName() {
			return name;
		}
	}
}
