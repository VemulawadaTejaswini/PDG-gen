import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
        int n = sc.nextInt();
        int[] al = new int[n];
        for(int i = 0; i < n; i++){
            al[i] = sc.nextInt();
        }
        long ans = 0;
        for(int i = 0; i < n; i++){
            ans += al[i]/2;
            al[i] %= 2;
            if(i != 0 && al[i-1] == 1 && al[i] == 1){
                ans++;
            }
        }
        System.out.println(ans);
    }
    
}

