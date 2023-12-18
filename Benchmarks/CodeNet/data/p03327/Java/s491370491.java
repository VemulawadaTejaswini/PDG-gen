import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Main m = new Main(sc);
        m.show(m.solve());
    }
    
    Scanner sc;
    int N;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        N = sc.nextInt();
    }
    
    //解答処理
    String solve() {
        String s = null;
        if (N < 1000){
            s = "ABC";
        } else {
            s = "ABD";
        }
        
        return s;
    }
    
    //出力
    void show(String answer) {
        System.out.println(answer);
    }
}
