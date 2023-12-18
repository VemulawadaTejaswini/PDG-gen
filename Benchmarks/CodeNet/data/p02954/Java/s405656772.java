import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 地点数の入力
		String s = sc.nextLine();
		String result = "";
		String[] sList = s.split("");

		//同じ文字が連続する回数をカウント
		//その数以上の偶数回シミュレートする
		String before = "";
		int count = 0;
		int maxCount = 0;
		for (int i = 0; i < sList.length; i++) {
			String now = sList[i];
			//System.out.println(before+now);
			if (!before.equals(now)) {
				count = 1;
				//System.out.println("count1");
			} else {
				count++;
				//System.out.println("coutn++");
			}
			before = now;
			if (count > maxCount) maxCount = count;
		}



		result = "";


		System.out.println(result);
	}}