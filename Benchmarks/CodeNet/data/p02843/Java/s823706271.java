import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int x = sc.nextInt();

      if (x%2==0||x%3==0||x%5==0) {
        System.out.println(1);
      }else{
        System.out.println(0);
      }


  }
}
