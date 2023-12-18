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
        int ans = 0;

        while(true){
            if(n == 111){
                ans = 111;
                break;
            }
            if(n == 222){
                ans = 222;
                break;
            }
            if(n == 333){
                ans = 333;
                break;
            }
            if(n == 444){
                ans = 444;
                break;
            }
            if(n == 555){
                ans = 555;
                break;
            }
            if(n == 666){
                ans = 666;
                break;
            }
            if(n == 777){
                ans = 777;
                break;
            }
            if(n == 888){
                ans = 888;
                break;
            }
            if(n == 999){
                ans = 999;
                break;
            }
            n++;
        }

        System.out.println(ans);
    }
}
