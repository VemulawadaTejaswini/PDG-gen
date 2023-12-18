import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Main m = new Main(sc);
        m.show(m.solve());
    }
    
    Scanner sc;
    BigInteger A;
    BigInteger B;
    String answer = null;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        A = sc.nextBigInteger();
        B = sc.nextBigInteger();
    }
    
    //解答処理
    String solve() {
        if (A.compareTo(B) > 0){    //AがBより多い場合は正の値
            answer = "GREATER";
        } else if (A.compareTo(B) < 0){    //AがBより多い場合は負の値
            answer = "LESS";
        } else {
            answer = "EQUAL";
        }

        return answer;
    }
    
    //出力
    void show(String answer) {
        System.out.println(answer);
    }
}