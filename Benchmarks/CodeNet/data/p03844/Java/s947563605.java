import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int num1 = scan.nextInt();
      String op = scan.next();
      int num2 = scan.nextInt();
        if(op.equals("+")){
          System.out.println(num1 + num2);
        }
        else{
          System.out.println(num1 - num2);
        }
    }
}