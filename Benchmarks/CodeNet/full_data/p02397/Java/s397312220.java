import java.util.*;
  
class Main{
  public static void main(String[] args){
    Scanner stdId = new Scanner(System.in);
    int x = stdId.nextInt(); 
    int y = stdId.nextInt(); 
    while(x!=0 && y!=0){
      System.out.println(y + " " + x);
      x = stdId.nextInt();
      y = stdId.nextInt();
    }
  }
}