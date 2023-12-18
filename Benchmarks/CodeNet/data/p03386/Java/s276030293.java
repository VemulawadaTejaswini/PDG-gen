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
    int[] answer;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        A = sc.nextInt();
        B = sc.nextInt();
        K = sc.nextInt();
        answer = new int[B+1];
    }
    
    //解答処理
    int[] solve() {
        int num = A;
        for (int i = 0; i<answer.length; ++i){
            if ((A <= num && num <= B) && (num < A+K || B-K < num)){
                answer[i] = num;
            }
            if (num == B){
                break;
            }
            num++;
        }
        
        Arrays.sort(answer);
        return answer;
    }
    
    //出力
    void show(int[] answer) {
        for (int i=0; i<answer.length; ++i){
            if (answer[i] != 0){
                System.out.println(answer[i]);
            }
        }
    }
}