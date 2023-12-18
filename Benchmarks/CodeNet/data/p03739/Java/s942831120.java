import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[][] map;
    static int[][] label;


    static ArrayList<String> list;

    static int M;
    static int N;
    static int T;
    static int P;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        long sum = scanner.nextLong();
        long ans = 0;
        boolean sign = true;
        if(sum < 0)sign = false;

        for (int i = 0; i < n - 1; i++) {
            sum += scanner.nextLong();
//            System.out.println(sum);
//            System.out.println(ans);
            if(sign){
                if(sum >= 0){
                    ans += sum + 1;
                    sum = -1;
                }
                sign = false;
            }else{
                if(sum <= 0){
                    ans -= sum - 1;
                    sum = 1;
                }
                sign = true;
            }

        }


        System.out.println(ans);
    }



}
