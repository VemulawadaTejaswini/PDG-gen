import java.util.*;

public class Main {
  public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int num1 = sc.nextInt();
          int num2 = sc.nextInt();
          if(num1 == 1){
            num1 = 14;
          }
          if(num2 ==1){
            num2 = 14;
          }
            if(num1 > num2){
            System.out.println("Alice");
          } else if(num1 == num2){
            System.out.println("Draw");
          } else {
            System.out.println("Bob");
          }
        }
    
}