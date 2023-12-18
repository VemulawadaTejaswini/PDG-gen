import java.util.*;
import javax.lang.model.util.ElementScanner6;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

        // 入力
        int n = sc.nextInt();
        double n1 = (double) n;

        int x1 = (int) (n1 / 1.08);
        int n2 = (int) (x1 * 1.08);
        int n3 = (int) ((x1 + 1) * 1.08);

        String out = "";
        if (n == n2) {
            out = Integer.toString(x1);
        } else if (n == n3) {
            out = Integer.toString(x1 + 1);
        } else {
            out = ":(";
        }

        // 出力
		System.out.println(out);
    }
}