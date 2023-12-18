import java.util.*;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int yen = sc.nextInt();
    
    int x = 0;
    int y = 0;
    int z = 0;
    x = yen / 10000;
    if(x < num){
      int zyen = yen % 10000;
      y = zyen / 5000;
      if(y < num - x){
        int yyen = yen % 5000;
        z = yyen / 1000;
        if(z < num - (x + y)){
          System.out.println(x + " " + y + " " + z);
        }else{
          System.out.println("-1 -1 -1");
        }
      }else{
        System.out.println("-1 -1 -1");
      }
    }else{ 
      System.out.println("-1 -1 -1");
    }
  }
}