import java.util.*;
import java.io.*;
public class Main {

    public static void main (String[] args) throws java.lang.Exception
{
    BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
    int N = Integer.parseInt(inp.readLine());
    boolean res = true; 
    for(int i= 1 ; i<=9 ; i++){
        for(int j=1 ; j<=9 ; j++){
         if(i*j == N) {
             res = false;
            System.out.println("Yes");
            break; 
         }
            
         }
        }
        if(res == true){
            System.out.println("No");
        }
        
   }
   

    
}
