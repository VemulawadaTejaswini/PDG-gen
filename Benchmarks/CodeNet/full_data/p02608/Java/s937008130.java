import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Main m = new Main(sc);
        m.show(m.solve());
    }
    
    Scanner sc;
    int N;
    int[] answer;   //条件を満たす個数のカウント
    
    //入力
    Main(Scanner sc) {
        this.sc = sc;
        N = sc.nextInt();
        answer = new int[N];
    }
    
    //解答処理
    int[] solve() {
        for (int i=0; i<N; ++i){
           for (int x=1; x<100; ++x){
               for (int y=1; y<100; ++y){
                   for (int z=1;z<100; ++z){
                       int n = x*x + y*y + z*z + x*y + y*z + z*x;
                       if (n < N){
                           ++answer[n];
                       }
                   }
               }
           }
           
        }
        
        return answer;
    }
    
    //出力
    void show(int[] answer) {
        for (int i=0; i<N; ++i){
            System.out.println(answer[i]);
        }
    }
}