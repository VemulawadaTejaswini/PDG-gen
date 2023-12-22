import java.util.*;
import java.util.ArrayList;

public class Main{
 public static void main(String[] args){
  int w;
  Scanner sc = new Scanner(System.in);
  int W = sc.nextInt();
  int H = sc.nextInt();
  int x = sc.nextInt();
  int y = sc.nextInt();
  int r = sc.nextInt();
  boolean z = false;
  if ( x - r >= 0 && x + r <= W){
   if ( y - r >= 0 && y + r <= H){
    z = true;
   };
  };
  if ( z == true ){
   System.out.println("Yes");
  }else{
   System.out.println("No");
  }
 }
}   
