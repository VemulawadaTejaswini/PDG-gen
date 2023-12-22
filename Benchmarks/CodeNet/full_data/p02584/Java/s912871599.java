import java.util.*;

public class Main{
 
  public static void main(String args[]){
    
   	Scanner s = new Scanner(System.in);
    
    long dis = s.nextLong();
    long mov = s.nextLong();
    long am = s.nextLong();
    
    while(mov > 0){
      
      if(Math.abs(dis + am) > Math.abs(dis - am))
        dis -= am;
      else
        dis += am;
     
      mov--;
      
    }
    
    System.out.println(dis);
    
  }
  
}