import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    static long[][] selfCon, selfUncon;
    static long mod = 1000000000+7;
    static int n;
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] vc = new int[n][2];
        int[] v=new int[n], c = new int[n];
        for(int i=0;i<n;i++) v[i]=sc.nextInt();
        for(int i=0;i<n;i++) c[i]=sc.nextInt();
        int ans =  0;
        for(int i=0;i<n;i++) ans += Math.max(0,v[i]-c[i]);
        System.out.println(ans);
    }
}
