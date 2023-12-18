import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Main m = new Main(sc);
        m.show(m.solve());
    }
    
    Scanner sc;
    String A;
    String B;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        A = sc.next();
        B = sc.next();
    }
    
    //解答処理
    String solve() {
        String answer = null;
        if (A.length() > B.length()){  //桁数の比較
            answer = "GREATER";
        } else if (A.length() < B.length()){
            answer = "LESS";
        } else {    //桁数が同じであれば、各位の値を比較
           answer = "EQUAL";
           
           for (int i=0; i<A.length(); ++i){
               if (A.charAt(i) > A.charAt(i)){
                   answer = "GREATER";
                   break;
               } else {
                   answer = "LESS";
                   break;
               }
           }
           
        }

        return answer;
    }
    
    //出力
    void show(String answer) {
        System.out.println(answer);
    }
}