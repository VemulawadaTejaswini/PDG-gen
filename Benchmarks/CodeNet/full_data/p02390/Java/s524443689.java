import java.lang.*;
import java.util.*;
  
class Main{
   public static void main(String[] args){
     Scanner stdId = new Scanner(System.in);
     int S = stdId.nextInt(); 
     System.out.println("" + S/3600 + ":" + S%3600/60 + ":" + S%60);
  }
}