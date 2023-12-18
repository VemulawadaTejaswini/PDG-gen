import java.util.*;
import java.math.*;

public class Main {

    public static void main(String[] args) {
        //AtCoder Beginner Contest 052
        //d
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int[] twn = new int[n];
        int[] dist = new int[n];
        int ans =  0;
        for(int i = 0; i < n; i++){
            twn[i] = Integer.parseInt(sc.next());
        }
        for(int i = 0; i < n-1; i++){
            dist[i] = Math.min((twn[i+1]-twn[i])*a, b);
        }
        for(int i = 0; i < n; i++){
            ans +=dist[i];
        }
        System.out.println(ans);
    }
}