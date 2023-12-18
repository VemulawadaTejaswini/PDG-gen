import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input =
            new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(input.readLine());
        cal(n);
    }


    static void cal(int n) {
        long sum = 0;
        long last = 0;
        for (int i=2+(n-2)/2; i<=n-1; i++) {
            last = perm(n-3,i-2) * comb(i,i) * comb(n-3-i, n-3-i) - last;
            
            sum += last * i;
            sum %= 1e9+7;
            //System.out.println("i="+i+"; " + perm(n-3,i-2) + " " + comb(i,i)+ " " +comb(n-3-i, n-3-i));
        }
        System.out.println(sum);
    }


    public static long comb(int n, int r) {
        long ret = 1;
        for (int i=0; i<r; i++) {
            ret *= n-i;
            ret %= 1e9+7;
        }
        return ret;
    }

    public static long perm(int n, int r) {
        long ret = 1;
        for (int i=0; i<r; i++) {
            ret *= n-i;
            ret /= i+1;
        }
        return ret;
    }
}
