import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        String[] input = br.readLine().split(" ");
        long n = Long.parseLong(input[0]);
        long a = Long.parseLong(input[1]);
        long b = Long.parseLong(input[2]);
        long ans = 0;
        
        if(n % (a + b) >= b){
            ans = a * (n / (a + b)) + a;
        }else{
            ans = a * (n / (a + b)) + (n % (a + b));
        }
        
        out.println(ans);
        out.close();
        
    }
}