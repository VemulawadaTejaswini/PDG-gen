import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int a = 1;
    int b = 1;
    
    
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            b = Integer.parseInt(st.nextToken());
            a = Integer.parseInt(st.nextToken());

            if(a==0&&b==0)break;
            for(int x = 0; x<b; x++){
                
                
                for(int y = 0; y<a; y++){
                    System.out.print("#");
                }
                
                System.out.print("\n");
            }
            
            System.out.print("\n");
            
        }
        
    }
}