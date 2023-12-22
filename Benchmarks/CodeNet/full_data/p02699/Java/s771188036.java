import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    
    Scanner scan;
    int sheep;
    int wolves;
    
    sheep = 0;
    wolves = 0;
    
    scan = new Scanner(String.in);
    sheep = scan.nextInt();
    wolves = scan.nextInt();
    
    if (sheep > wloves){
      System.out.println("safe");
    }else {
      System.out.println("unsafe");
    }
      
  }
}