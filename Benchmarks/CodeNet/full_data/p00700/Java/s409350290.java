import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
 
 
public class Main {
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        final int n = sc.nextInt();
         
        for(int i = 0; i < n; i++){
           int x = 0;
           int y = 0;
           
           int m_dist = 0;
           int m_x=0,m_y=0;
           
           while(true){
        	   final int dx = sc.nextInt();
        	   final int dy = sc.nextInt();
        	   
        	   if(dx == 0 && dy == 0){
        		   break;
        	   }
        	   
        	   x += dx;
        	   y += dy;
        	   
        	   if(m_dist < x*x + y*y){
        		   m_dist = x*x + y*y;
        		   m_x = x;
        		   m_y = y;
        	   }else if(m_dist == x*x + y*y && m_x < x){
        		   m_x = x;
        	   }
           }
           
           System.out.println(m_x + " " + m_y);
        }
         
         
    }
 
}