import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] c = new long[n];
        long sum = 0;
        for(int i=0;i<n;i++){
            long a = sc.nextLong(), b = sc.nextLong();
            sum -= b;
            c[i] = a+b;
        }
        Arrays.sort(c);
        for(int i=n-1;i>=0;i-=2) sum += c[i];
        System.out.println(sum);
    }
}
