import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        String[] input = br.readLine().split(" ");
        long a = Long.parseLong(input[0]);
        long b = Long.parseLong(input[1]);
        long c = Long.parseLong(input[2]);
        long k = Long.parseLong(input[3]);
        long ans = 0;
        
        if(a + b >= k){
            ans = a;
        }else{
            ans = a - (k - (a + b));
        }
        
        out.println(ans);
        out.close();
        
    }
}