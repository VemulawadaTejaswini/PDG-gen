import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Vector;
 
class Main {
 
    /**
     * Returns list of all indices where pattern is found in text.
     */
    public static int[] calculateZ(char input[]) {
        int Z[] = new int[input.length];
        int left = 0;
        int right = 0;
        for (int k = 1; k < input.length; k++) {
            if (k > right) {
                left = right = k;
                while (right < input.length && input[right] == input[right - left]) {
                    right++;
                }
                Z[k] = right - left;
                right--;
            } else {
                // we are operating inside box
                int k1 = k - left;
                // if value does not stretches till right bound then just copy it.
                if (Z[k1] < right - k + 1) {
                    Z[k] = Z[k1];
                } else { // otherwise try to see if there are more matches.
                    left = k;
                    while (right < input.length && input[right] == input[right - left]) {
                        right++;
                    }
                    Z[k] = right - left;
                    right--;
                }
            }
        }
        return Z;
    }
 
    /**
     * Returns list of all indices where pattern is found in text.
     */
 
    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
 
    public static int[] radixSort(int[] f) {
        return radixSort(f, f.length);
    }
 
    public static int[] radixSort(int[] f, int n) {
        int[] to = new int[n];
        {
            int[] b = new int[65537];
            for (int i = 0; i < n; i++)
                b[1 + (f[i] & 0xffff)]++;
            for (int i = 1; i <= 65536; i++)
                b[i] += b[i - 1];
            for (int i = 0; i < n; i++)
                to[b[f[i] & 0xffff]++] = f[i];
            int[] d = f;
            f = to;
            to = d;
        }
        {
            int[] b = new int[65537];
            for (int i = 0; i < n; i++)
                b[1 + (f[i] >>> 16)]++;
            for (int i = 1; i <= 65536; i++)
                b[i] += b[i - 1];
            for (int i = 0; i < n; i++)
                to[b[f[i] >>> 16]++] = f[i];
            int[] d = f;
            f = to;
            to = d;
        }
        return f;
    }
 
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner ob = new Scanner(System.in);
        int T = ob.nextInt();
        int b = ob.nextInt();
        out.println(T * b);
        out.close();
    }
}