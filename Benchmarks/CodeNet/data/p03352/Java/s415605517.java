
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double heiho = Math.floor(Math.sqrt(a));
      //インスタンスの作成
        BigDecimal bd = new BigDecimal(heiho);

        //小数第1位で切り捨て
        BigDecimal bd1 = bd.setScale(0, BigDecimal.ROUND_DOWN);
        int hoge = bd1.intValue();
        System.out.println(hoge * hoge);
	}
}
