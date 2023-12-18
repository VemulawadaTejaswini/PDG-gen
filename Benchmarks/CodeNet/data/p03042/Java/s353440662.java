
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int S = Integer.parseInt(sc.next());//int型
		int bb = S%100;
		int aa = S/100;
		String aaIs = new String();
		String ans = new String();
		if (aa>=1 && aa<=12 && bb>=1 && bb<=12) {
			ans = "AMBIGUOUS";
		} else if (aa>=1 && aa<=12 && (bb==0 || bb>12)) {
			ans = "MMYY";
		} else if (bb>=1 && bb<=12 && (aa==0 || aa>12)) {
			ans = "YYMM";
		} else ans = "NA";
		System.out.println(ans);
	}

}
