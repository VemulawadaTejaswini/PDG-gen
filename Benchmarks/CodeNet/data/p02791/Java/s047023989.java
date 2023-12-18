import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for(int i = 0; i < n; i++){
            p[i] = sc.nextInt();
        }
        int min = p[0];
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(min >= p[i]){
                ans++;
            }
            min = Math.min(min,p[i]);
        }
        System.out.println(ans);
    }
}