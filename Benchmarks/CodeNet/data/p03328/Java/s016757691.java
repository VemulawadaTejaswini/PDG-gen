import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Main m = new Main(sc);
        m.show(m.solve());
    }
    
    Scanner sc;
    int a;
    int b;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        a = sc.nextInt();
        b = sc.nextInt();
    }
    
    //解答処理
    int solve() {
        int x = 0;  //雪の積もった高さ
        //int towerB = 0
      
        x = (b-a) * (b-a+1) / 2 -b;
        return x;
    }
    
    //出力
    void show(int answer) {
        System.out.println(answer);
    }
}
