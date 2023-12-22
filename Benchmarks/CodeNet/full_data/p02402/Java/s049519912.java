
import java.util.Scanner;

public class Main {
    static public void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long sum = 0;
        long[] a = new long[n];

        for(int i = 0; i < n; i++){
            a[i] = s.nextInt();
        }

        long min = a[0];
        long max = a[0];
        for(long val : a) {
            min = Math.min(min, val);
            max = Math.max(max ,val);
        }
        for(int i = 0; i < n; i++ ){
            sum += a[i];
        }
        System.out.println(min + " " + max + " " + sum);
    }
}

