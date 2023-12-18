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
        a =sc.nextInt();
        b = sc.nextInt();
    }
    
    //解答処理
    int solve() {
        int countTakahashi = 0;
        for (int i=1; i<=a; i++){
            countTakahashi++;
        }
        if (a > b){
            countTakahashi--;
        }
        
        return countTakahashi;
    }
    
    //出力
    void show(int answer) {
        System.out.println(answer);
    }
}
