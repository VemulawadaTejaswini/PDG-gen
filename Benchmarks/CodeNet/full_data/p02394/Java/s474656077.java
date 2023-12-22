import java.util.*;
  
class Main{
   public static void main(String[] args){
     Scanner stdId = new Scanner(System.in);
     int W = stdId.nextInt(); 
     int H = stdId.nextInt(); 
     int x = stdId.nextInt(); 
		 int y = stdId.nextInt();
		 int r = stdId.nextInt();
     //
     int Distance = Math.min(x,y,W-x,H-y);
     if(Distance>=r) System.out.println("Yes");
     else System.out.println("No");
  }
}