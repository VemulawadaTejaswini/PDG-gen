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
        boolean check = false;
        loop: for(int i=4; i<=100; i+=4){
            for(int j=7; j<=100; j+=7){
                int sum = i + j;
                if(sum == n){
                    check = true;
                    break;
                }
            }
        }

        if(check) System.out.println("Yes");
        else System.out.println("No");
//        int n = sc.nextInt();
//        int b = sc.nextInt();
//
//        int syou = n/b;
//        int amari = n%b;
//
//        if(amari == 0){
//            System.out.println(0);
//        } else {
//            System.out.println(syou-amari);
//        }
    }
}
