import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();
      int total = 0;
      if(num1 % num2 > 1){
      total = (num2 / (num1 - 1));
      if(total < num2){
        total = total +1;
      }
      } else {
        total = 1;
      }
      System.out.print(total);
    }
}