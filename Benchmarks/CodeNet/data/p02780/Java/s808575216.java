
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        long sum = 0;
        long max = 0;

        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0; i<k; i++) {
            sum += (a[i] + 1);
        }
        max = sum;
        for(int i=k; i<n; i++) {
            sum += (a[i] + 1);
            sum -= (a[i-k] + 1);
            max = Math.max(max, sum);
        }


        System.out.println((double)(max) / 2) ;


    }


}
