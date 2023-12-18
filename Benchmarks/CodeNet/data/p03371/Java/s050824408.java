import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

    //グローバル変数を定義

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        int aCost = sc.nextInt();
        int bCost = sc.nextInt();
        int abCost = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int sum5 = 0;

        if(A == B){
            sum1 += abCost*A*2;
            sum2 += abCost*A*2;
            sum3 += abCost*A*2;
            sum4 += abCost*A*2;
            sum5 += abCost*A*2;
        } else {
            sum1 += bCost*B + aCost*A;
            if(A-B < 0){
                sum2 += abCost*B*2;
                sum3 += abCost*B*2;
            } else {
                sum2 += abCost*B*2 + aCost*(A-B);
                sum3 += abCost*B*2 + aCost*(A-B);
            }

            if(B-A < 0){
                sum4 += abCost*A*2;
                sum5 += abCost*A*2;
            } else {
                sum4 += abCost*A*2 + bCost*(B-A);
                sum5 += abCost*A*2 + bCost*(B-A);
            }

        }

        int min = Math.min(sum1, sum2);
        min = Math.min(min, sum3);
        min = Math.min(min, sum4);
        min = Math.min(min, sum5);

        System.out.println(min);
    }
}
