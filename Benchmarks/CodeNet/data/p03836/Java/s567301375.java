import java.util.*;
import java.math.BigDecimal;
 
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        int tx = sc.nextInt();
        int ty = sc.nextInt();

        int h = ty - sy;    
        int w = tx - sx;    
 
        String ans = ""; 
 
        for(int i=0; i<h; i++){
            ans += "U";             
        }
        for(int i=0; i<w; i++){
            ans += "R";
        }
        for (int i=0; i<h; i++){
            ans += "D";
        }
        for(int i=0; i<w; i++){
            ans += "L";
        }
      
        ans += "L";
      
        for(int i=0; i<h+1; i++){
            ans += "U";
        }
        for (int i=0; i<w+1; i++){
            ans += "R";
        }
      
      	ans += "DR";	
      
        for (int i=0; i<h+1; i++){
            ans += "D";
        }
        for(int i=0; i<w+1; i++){
            ans += "L";
        }
 
      	ans +="U";	
      
        System.out.println(ans);
 
    }
}