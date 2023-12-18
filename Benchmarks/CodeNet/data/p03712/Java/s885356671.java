import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    String S[] = new String[H];
    for(int i=1;i<=W+2;i++){
      System.out.print("#");
    }
    System.out.println("");
    for(int i=1;i<=H;i++){
      System.out.print("#");
      System.out.print(sc.next());
      System.out.println("#");
    }
    for(int i=1;i<=W+2;i++){
      System.out.print("#");
    }
    
  }
  

  
}