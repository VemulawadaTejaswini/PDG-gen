import java.util.*;
import javax.lang.model.util.ElementScanner6;
//import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        //int n = sc.nextInt();
        String s = sc.next();

        // 処理
        int len = s.length();
        int out = 0;
        if(len < 4){
            out = 0;
        } else {
            for(int i = 0; i < len - 4; i++){
                for(int j = i + 4; j < len + 1; j++){
                    //System.out.println(s.substring(i,j));
                    if(Float.parseFloat(s.substring(i,j)) % 2019 == 0) {
                        out++;
                    }
                }
            }
        }

        // 出力
        System.out.println(out);
    }
}