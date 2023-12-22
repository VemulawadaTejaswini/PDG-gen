import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int k = sc.nextInt();
      int a = sc.nextInt();
      int b = sc.nextInt();
      int sum = a / k * k;
      int sum2 = a / k * (k + 1);
      if(sum >= a && sum <= b || sum2 >= a && sum2 <= b)
        System.out.println("OK");
      else
        System.out.println("NG");
  }
}