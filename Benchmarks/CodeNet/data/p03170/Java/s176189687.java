import java.util.*;
import java.io.*;

/*
   AtCoder contest code
   coder : yoichidon
 */

public class Main {
    public static String longer(String x, String y){
        if(x.length() > y.length()) return x;
        else return y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] a = new int[N];
        for(int n=0; n<N; n++) a[n]=sc.nextInt();
        boolean[] taroWin = new boolean[K+1];
        Arrays.fill(taroWin,false);
        for(int k=1; k<=K;k++){
            for(int m:a) if(m<=k && !taroWin[k-m]) taroWin[k]=true;
        }

        System.out.println(taroWin[K] ? "First" : "Second");


    }
}
