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
    String answer;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        A = sc.next();
        B = sc.next();
    }
    
    //解答処理
    String solve() {
        if (A.length() > B.length()){  //桁数の比較
            answer = "GREATER";
        } else if (A.length() < B.length()){
            answer = "LESS";
        } else if (A.length() == B.length()){    //桁数が同じであれば、各位の値を比較
           answer = "EQUAL";
           String a[] = A.split("");
           String b[] = B.split("");
           
           for (int i=0; i<A.length(); ++i){
               if (Integer.parseInt(a[i]) > Integer.parseInt(b[i])){
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