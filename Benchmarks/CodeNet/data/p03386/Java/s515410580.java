import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Main m = new Main(sc);
        m.show(m.solve());
    }
    
    Scanner sc;
    int A;
    int B;
    int K;
    ArrayList<Integer> answer = new ArrayList<Integer>();
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        A = sc.nextInt();
        B = sc.nextInt();
        K = sc.nextInt();
    }
    
    //解答処理
    ArrayList<Integer> solve() {
        if(B-A+1 > 2*K){ //A以上B以下の整数の個数(B-A+1)が2Kより大きい場合
            for(int i=A; i<A+K ; i++){ //小さいほうからK番目まで
                answer.add(i);
            }
            for(int i=B; i>B-K; i--){ //大きい方からK番目まで
                answer.add(i);
            }
        } else {    //A以上B以下の整数の個数(B-A+1)が2K個以下だった場合
            for(int i=A; i<=B; i++){    //値をすべてそのまま格納
                answer.add(i);
            }
        }
        
        Collections.sort(answer);
        return answer;
    }
    
    //出力
    void show(ArrayList<Integer> answer) {
        for (int i=0; i<answer.size(); ++i){
            System.out.println(answer.get(i));
        }
    }
}
