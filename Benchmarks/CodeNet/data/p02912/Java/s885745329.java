import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] prices = new int[n];
        for(int i=0;i<n;i++){
            prices[i] = sc.nextInt();
        }

        Arrays.sort(prices);

//        for(int i=0;i<n;i++) {
//            System.out.println(prices[i]+",");
//        }
        for(int i=0;i<m;i++){
            prices[n-1] = prices[n-1]/2;
            //System.out.println((n-1-i) + "=" + prices[n-1-i]);
            Arrays.sort(prices);
        }

        long count = 0;
        for(int i=0;i<n;i++) {
            //System.out.println(prices[i]+",");

            count += prices[i];
        }
        System.out.println(count);




    }
}