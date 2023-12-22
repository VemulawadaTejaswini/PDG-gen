//I AM THE CREED
/* //I AM THE CREED
/* package codechef; // don't place package name! */
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer; 
import java.util.*;
public class Main{
    public static void main(String[] args) throws IOException 
    { 
  
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
          int n=input.nextInt();
          String s=input.next();
          int first_r=Integer.MAX_VALUE;
          int tot_r=0;
          int tot_w=0;
          for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'){
              first_r=Math.min(i, first_r);
              tot_r++;
              continue;
            }
            tot_w++;
          }
          if(tot_w==0||tot_r==0){
              System.out.println(0);
              continue;
          }
          if(first_r<tot_r){
            System.out.println(tot_r-1);
            continue;
          }
          System.out.println(tot_r);
        }
        
    }
    


}