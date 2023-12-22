//Created by Aminul on 7/25/2020.

import java.io.*;
import java.util.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args)throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt(), k = in.nextInt();
        double a[] = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = log(in.nextInt());
        }
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += a[i];
        }

        for(int i = k; i < n; i++) {
            double currSum = sum + a[i] - a[i - k];
            if(currSum > sum) pw.println("Yes");
            else pw.println("No");
            sum = currSum;
        }
          
        pw.close();
    }

    static void debug(Object...obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}