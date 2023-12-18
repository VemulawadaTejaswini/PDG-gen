import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int a = Integer.parseInt(input[1]);
        int b = Integer.parseInt(input[2]);
        int ans = 0;
        
        for(int i = 1; i <= n; i++){
            
            int num = i;
            int total = 0;
            
            while(num > 0){
                total += num % 10;
                num /= 10;
            }
            
            if(a <= total && total <= b){
                ans += i;
            }
            
        }
        
        out.println(ans);
        out.close();
        
    }
}