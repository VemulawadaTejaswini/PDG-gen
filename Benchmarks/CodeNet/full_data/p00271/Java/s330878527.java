package pasokonkousien;

import java.util.Scanner;

public class Toi12013 {
	Scanner sc = new Scanner(System.in);
	int[] a = {30,39,19,25,22,23,10};
	int[] b = {19,20,18,20,21,10,-10};
	int n;
	int [] c = new int [8];

	public void hiki(){
		for(n=0;n<7;n++){
			c[n]=a[n] - b[n];
			System.out.println(c[n]);
		}
	}




	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Toi12013 toi = new Toi12013();
		toi.hiki();
	}
}