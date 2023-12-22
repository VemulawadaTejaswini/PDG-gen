import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    boolean tmp = true;

    while(tmp){
      long a = sc.nextLong();
      String op = sc.next();
      long b = sc.nextLong();

      if(op.equals("?")){
        tmp = false;
        break;
      } else if(op.equals("+")){
        System.out.println(a + b);
      } else if(op.equals("-")){
        System.out.println(a - b);
      } else if(op.equals("*")){
        System.out.println(a * b);
      } else {
        System.out.println(a / b);
      }
    }
  }
}

