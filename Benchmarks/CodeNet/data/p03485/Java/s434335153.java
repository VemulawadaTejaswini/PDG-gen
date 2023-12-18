import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        /*2つの整数a,bの平均値xを求める
        xの小数点以下を切り上げた値を出力*/
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        double x = ((double)a + (double)b) / 2;
        int ans = (int)Math.ceil(x);
        System.out.println(ans);
    }
}
