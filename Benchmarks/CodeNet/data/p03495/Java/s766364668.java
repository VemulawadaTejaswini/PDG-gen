import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        Integer[] a = new Integer[n];
        Arrays.fill(a,0);
        for(int i=0; i<n; i++) {
            a[sc.nextInt()-1]++;
        }

        Arrays.sort(a, Collections.reverseOrder());

        int sum = 0;
        for(int i=0; i<a.length; i++) {
            if(i > k-1) {
                sum += a[i];
            }
        }

        System.out.println(sum);
        sc.close();
    }
}
