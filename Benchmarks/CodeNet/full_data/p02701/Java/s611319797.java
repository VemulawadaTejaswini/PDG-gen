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
        HashSet<String> s = new HashSet<>();
        for (int i = 0; i < n; i++){
            String a = sc.next();
            s.add(a);
        }
        int out = s.size();

        // 出力
        System.out.println(out);
    }
}