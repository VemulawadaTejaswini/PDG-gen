import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int x = 0;
    int y = 0;
    for(int i = 0;i < num;i++){
      int sec = sc.nextInt();
      int mx = sc.nextInt();
      int my = sc.nextInt();
      int move = Math.abs(mx - x) + Math.abs(my - y);
      if(move <= sec){
        sec -= move;
        if(sec % 2 != 0){
          System.out.println("No");
          System.exit(0);
        }
      }
      else{
        System.out.println("No");
        System.exit(0);
      }
    }
    System.out.println("Yes");
  }
}
      