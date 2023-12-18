import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Main m = new Main(sc);
        m.show(m.solve());
    }
    
    Scanner sc;
    int X = 0;
    String S;
    int min = Integer.MAX_VALUE;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        S = sc.next();
    }
    
    //解答処理
    int solve() {
        for (int i=0; i<(S.length()-2); ++i){
            int X = Integer.parseInt(S.substring(i,i+3));    //Sから取り出した数字をint型に変換
            int dif = Math.abs(X - 753);   //差の絶対値を求める
            min = Math.min(min,dif);  //小さい方をminに代入
        }
        
        int answer = min;
        return answer;
    }
    
    //出力
    void show(int answer) {
        System.out.println(answer);
    }
}