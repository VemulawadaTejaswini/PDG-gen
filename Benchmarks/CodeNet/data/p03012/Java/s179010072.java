import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] W = new int[N];
        for (int i=0;i<N;i++){
            W[i] = sc.nextInt();
        }
        int[] cum = new int[N+1];
        for (int i=0;i<N;i++){
            cum[i+1] = cum[i] + W[i];
        }
        int ans = Integer.MAX_VALUE;
        for (int i=0;i<N;i++){
            if (Math.abs(cum[i+1]-(cum[N]-cum[i+1]))<ans){
                ans = Math.abs(cum[i+1]-(cum[N]-cum[i+1]));
            }
        }
        System.out.println(ans);
    }
}