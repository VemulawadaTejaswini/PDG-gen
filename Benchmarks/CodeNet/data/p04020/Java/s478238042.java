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
        long now = 0;
        for(int i = 0; i < n; i++){
            if(al[i] == 0){
                ans += now/2L;
                now = 0;
            }else{
                now += al[i];
            }
        }
        System.out.println(ans+now/2L);
    }
    
}

