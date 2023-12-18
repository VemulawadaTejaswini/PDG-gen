import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] ar = new long[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextLong();
        }
        Arrays.sort(ar);
        long curr = ar[0];
        int start = 0;
        for(int i = 1; i < n; i++){
            if(2 * curr >= ar[i])
                curr += ar[i];
            else{
                start = i;
                curr += ar[i];
            }
        }
        System.out.println(n - start);
    }
}
