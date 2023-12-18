import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
 
public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
        int m = in.nextInt();
        in.nextLine();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(getMax(arr, m));
    }
    //1,2,3,4,5,6
    //-2C5 * 1;
    //-2C4 * 2;
    //2C2 * 3 - 2C3 * 3;
    //2C3 * 4 - 2C2 * 4;
    //2C4 * 5;
    //2C5 * 6;

    private static int getMax(int[] arr, int m) {
        Arrays.sort(arr);
        long sum = 0;
        int mod = 1000000007;
        int l = arr.length;
        long base = 1;

        for (int i = m - 1; i <= l - m ;i++) {
            sum = (sum + base * arr[i] - base * arr[l - i - 1]) % mod;
            //System.out.println(i + " " + sum);
            base = combo(i + 1, m - 1);
        }

        for (int i = 0; i < m - 1; i++) {
//            System.out.println("alwasy minus " + i);
//            System.out.println(combo(l - i - 1, m - 1) * arr[i]);
            sum = (sum - combo(l - i - 1, m - 1) * arr[i]) % mod;
        }

        for (int i = l - m + 1; i < l; i++) {
//            System.out.println("alwasy plus " + i);
//            System.out.println(combo(i, m - 1) * arr[i]);
            sum = (sum + combo(i, m - 1) * arr[i]) % mod;
        }

        return (int) ((sum % mod + mod) % mod);
    }

    private static long combo(int i, int m) {
        long res = 1;
        int mod = 1000000007;
        for (int k = 0; k < m; k++) {
            res *= (i - k);
            res /= (k + 1);
            res %= mod;
        }
        return res % mod;
    }
}
