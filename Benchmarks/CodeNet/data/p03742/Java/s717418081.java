import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long x = Long.parseLong(st.nextToken())/2*2;
        long y = Long.parseLong(st.nextToken())/2*2;
        long a = Math.max(x,y);
        long b = Math.min(x,y);
        if(a!=b){
            if((a-b)==4){
                System.out.println("Brown");
            }else{
                System.out.println("Alice");
            }
                   
        }else{
            System.out.println("Brown");
        }
        
    }
     
}
