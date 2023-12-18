import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] abt = br.readLine().split(" ");
        int a = Integer.parseInt(abt[0]);
        int b = Integer.parseInt(abt[1]);
        int t = Integer.parseInt(abt[2]);
        
        
        int ans = t/a*b;
        
        System.out.println(ans);
    }
}



