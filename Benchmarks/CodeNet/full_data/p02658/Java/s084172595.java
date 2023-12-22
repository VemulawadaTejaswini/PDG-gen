import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author : Ritchie Zhang
 * @date : 2020/5/10
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        boolean f = true;
        Scanner scanner = new Scanner(System.in);
        long sum = 1;
        long max = (long) Math.pow(10,18);
        long[] a = new long[100000];
        int n = scanner.nextInt();
        for(int j=0;j<n;j++){
            a[j] = scanner.nextLong();
        }
        for(int j=0;j<n;j++){
           sum *=a[j];

        }
        if(sum > max){
            f = false;
            System.out.println("-1");
        }
        if(f == true){
            System.out.println(sum);
        }


    }

}
