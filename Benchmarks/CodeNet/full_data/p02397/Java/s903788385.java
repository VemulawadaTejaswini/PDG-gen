import java.util.Scanner;
import java.util.ArrayList;
class Main {
 public static void main(String[] args){
  Scanner s = new Scanner(System.in);
  while(true){
   int x = s.nextInt();
   int y = s.nextInt();
   if(x == 0 || y == 0) break;
   if(x > y) System.out.println(y + " " + x);
   else System.out.println(x + " " + y);
  }
 }
}