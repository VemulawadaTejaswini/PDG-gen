import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int in = sc.nextInt();
    for(int i = 1; i <= in; i++){
      if (i % 3 == 0 || i % 10 == 3){
        System.out.print(" "+i);
        continue;
      }else{
        if (i/10 != 0 && i/10 == 3){
          System.out.print(" "+i);
          continue;
        }
      }
    }
    System.out.println();
  }
}