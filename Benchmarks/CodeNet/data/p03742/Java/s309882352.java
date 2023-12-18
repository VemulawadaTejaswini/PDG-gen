import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long x = Long.parseLong(st.nextToken());
        long y = Long.parseLong(st.nextToken());
        long a = Math.max(x,y);
        long b = Math.min(x,y);
        
        if((((a-b)>>1)^(a>>1)^(b>>1))==0){
            System.out.println("Alice");
        }else{
            System.out.println("Brown");
        }
        
    }
     
}

