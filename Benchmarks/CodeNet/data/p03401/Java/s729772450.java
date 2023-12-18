import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.BiConsumer;

public class Main {

    //グローバル変数を定義

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n+1];

        array[0] = 0;
        for(int i=1; i<=n; i++){
            array[i] = sc.nextInt();
        }

        int sum = 0;
        int before = 0;

        for(int i=1; i<=n; i++){
            int now = array[i];
            sum += Math.abs(now - before);
            before = now;
        }
        sum+=Math.abs(0-array[array.length-1]);

        for(int i=1; i<=n; i++){
            int ans = 0;
            if(i < n){
                ans = sum - (Math.abs(array[i] - array[i-1]) + Math.abs(array[i+1] - array[i])) + Math.abs(array[i+1] - array[i-1]);
            } else {
                ans = sum - (Math.abs(array[i] - array[i-1]) + Math.abs(0 - array[i])) + Math.abs(0 - array[i-1]);
            }
            System.out.println(ans);
        }
    }
}
