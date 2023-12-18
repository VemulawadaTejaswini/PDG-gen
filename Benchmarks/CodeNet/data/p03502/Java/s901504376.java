import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    float suti = scan.nextInt();
    float suti2 = suti;
    int wa = 0;
    while(suti != 0){
      wa = wa + (int)(suti % 10);
      suti = suti / 10;
    }
    if (suti2 % wa == 0) {
      System.out.println("Yes");
    }else {
      System.out.println("No");
    }
  }
}