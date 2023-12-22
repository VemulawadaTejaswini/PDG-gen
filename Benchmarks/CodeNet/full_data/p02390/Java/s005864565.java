import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
             
       Scanner sc = new Scanner(System.in);
       int s = sc.nextInt();
       int h = 0;
       int m = 0;
       
       while(s>=3600){
    	   s = s-3600;
       h++;
       }
       
       while(s>=60){
           s = s-60; 
       m++;
       
       
       }
      
       
       System.out.println(h+":"+m+":"+s);
           
         
    }
}