import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] a = new long[N];
        for(int n=0;n<N;n++) a[n] = sc.nextLong() - (n + 1);;
        Arrays.sort(a);
        
        long b=a[N/2];
        long ans=0;;
        for(int n=0;n<N;n++)ans += Math.abs(b-a[n]);
        System.out.println(ans);
    }
}