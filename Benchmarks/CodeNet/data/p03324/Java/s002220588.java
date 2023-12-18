import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Main m = new Main(sc);
        m.show(m.solve());
    }
    
    Scanner sc;
    int D;
    int N;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        D = sc.nextInt();
        N = sc.nextInt();
    }
    
    //解答処理
    int solve() {
        int num = 0;
        
        if (D == 0){
            num = N;
        } else {
            num = (int)Math.pow(100,D) * N;
        }
        return num;
    }
    
    //出力
    void show(int answer) {
        System.out.println(answer);
    }
}
