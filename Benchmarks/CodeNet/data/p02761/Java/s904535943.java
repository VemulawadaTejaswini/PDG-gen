import java.util.*;
import javax.lang.model.util.ElementScanner6;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int n = sc.nextInt();
        int[] work = new int[n];
        int[] hit  = new int[n];

        int out = 0;

        int m = sc.nextInt();
        int s;
        int c;
        for(int i = 0; i < m; i++){
            s = sc.nextInt();
            c = sc.nextInt();
            
            if(hit[s-1] != 0 && work[s-1] != c){
                out = -1;
                break;
            }
            work[s-1] = c;
            hit[s-1] = 1;
        }
        if(out != -1){
            if(n > 1 && work[0] == 0){
                out = -1;
            } else {
                for(int i = 0; i < n; i++){
                    //System.out.println(work[i]);
                    out += work[i] * (int)(Math.pow(10, n - i -1));
                }    
            }
        }

        // 処理

        // 出力
        System.out.println(out);
    }

}