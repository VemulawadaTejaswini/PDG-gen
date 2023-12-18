import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] NK = br.readLine().split(" ");
        int N = Integer.parseInt(NK[0]);
        int K = Integer.parseInt(NK[1]);
        String S = br.readLine();
        
        int happiness = 0;
        for(int i = 0; i < N - 1; i++){
            if( S.charAt(i) == S.charAt(i+1) ) happiness++;
        }
        
        System.out.println(Math.min(happiness += K * 2, N - 1));
    }
}
