import java.util.*;
import javax.lang.model.util.ElementScanner6;
//import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int n = sc.nextInt();
        String s = sc.next();

        // 処理
        char[] ary = new char[n];
        for(int i = 0; i < n; i++){
            ary[i] = s.charAt(i);
        }

        long out = 0;
        for(int i = 0; i < n - 2; i++){
            for(int j = i + 1; j < n - 1; j++){
                if(ary[i] == ary[j]) continue;
                for(int k = j + 1; k < n; k++){
                    if(ary[j] == ary[k]) continue;
                    //No1
                    if(ary[i] != ary[k] && (j - i) != (k - j)) out++;
                }
            }
        }

        // 出力
        System.out.println(out);
    }
}