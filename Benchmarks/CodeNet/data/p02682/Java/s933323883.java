import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int k = Integer.parseInt(input[3]);
        int ans = 0;
        
        if(a + b >= k){
            ans = a;
        }else{
            ans = a - (k - (a + b));
        }
        
        out.println(ans);
        out.close();
        
    }
}