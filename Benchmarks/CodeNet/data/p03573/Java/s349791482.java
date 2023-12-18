import java.util.*;

public class Main{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();
            if(num1 == num2){
              System.out.println(num3);
            } else if(num2 == num3) {
              System.out.println(num1);
            } else {
              System.out.println(num2);
            }
      }
}