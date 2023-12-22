import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    while(true){
      int x = sc.nextInt();
      if(x == 0) break;
      String oct = Integer.toString(x,8).replaceAll("7","9").replaceAll("6","8").replaceAll("5","7").replaceAll("4","5");
      System.out.println(oct);
    }
  }
}