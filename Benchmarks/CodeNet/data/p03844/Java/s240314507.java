/*
この問題はABC_50_Aである
opが"+"ならaとbを足し、"-"ならaとbを引く
*/
import java.util.*;

public class Addition_and_Subtraction_Easy{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    String op = sc.next();
    int b = sc.nextInt();
    String plus = "+";
    String minus = "-";
    if(op.equals(plus)){
      System.out.println(a+b);
    }
    else if(op.equals(minus)){
      System.out.println(a-b);
    }
  }
}
