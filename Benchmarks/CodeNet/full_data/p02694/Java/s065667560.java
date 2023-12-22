import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        long x = Long.parseLong(br.readLine());
        long balance = 100;
        int count = 0;
        boolean isOverX = false;
        
        while(!isOverX){
            balance += balance * 0.01;
            count++;
            if(balance >= x){
                isOverX = true;
                count = (int)count;
            }
        }
        
        out.println(count);
        out.close();
        
    }
}