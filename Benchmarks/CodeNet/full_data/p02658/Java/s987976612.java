import java.util.*;
import javax.lang.model.util.ElementScanner6;
import java.lang.Math;

public class Main {

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);

        // 入力
        //String t = sc.next();
        int n = sc.nextInt();

        // 
        long out = 1;
        long[] a = new long[n];
        boolean zeroflg = false;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextLong();
            if (a[i] == 0){
                zeroflg = true;
                break;
            }
        }
        if(zeroflg == true){
            out = 0;
        } else{
            for(int i = 0; i < n; i++){
                if(Math.log10(out) + Math.log10(a[i]) > 18 ||
                    out * a[i] > 1000000000000000000L ){
                    out = -1;
                    break;
                } else {;           
                    out *= a[i];
                }
            }
        }

        // 出力
        System.out.println(out);
    }    
}
