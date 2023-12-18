import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Main m = new Main(sc);
        m.show(m.solve());
    }
    
    Scanner sc;
    int N;
    int[] a;
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        N = sc.nextInt();
        a = new int[N];
        for (int i=0; i<N; i++){
            a[i] = sc.nextInt();
        }
    }
    
    //解答処理
    int solve() {
        double sum = 0;;
        for (int i=0; i<N; i++){
            sum += a[i];
        }
        double avr = sum / N;   //平均
        double min = Integer.MAX_VALUE;
        double dif = 0;    //差
        int answer = 0;
        
        for (int i=0; i<N; i++){
            dif = Math.abs(a[i]-avr);
            if (min > dif){
                min =  dif;
                answer = i;
            }
        }
        
        return answer;
    }
    
    //出力
    void show(int answer) {
        System.out.println(answer);
    }
}
