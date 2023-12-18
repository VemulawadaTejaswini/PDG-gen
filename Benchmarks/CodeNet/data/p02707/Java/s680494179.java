import java.util.*;
import javax.lang.model.util.ElementScanner6;
//import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int n = sc.nextInt();
        //String s = sc.next();

        // 処理
        int[] buka = new int[n];
        for(int i = 2; i <= n; i++){
            int a = sc.nextInt();
            buka[a-1] += 1;
        }

        for(int i = 0; i < n; i++){
            System.out.println(buka[i]);
        }

        // 出力
        //System.out.println(out);
    }
}