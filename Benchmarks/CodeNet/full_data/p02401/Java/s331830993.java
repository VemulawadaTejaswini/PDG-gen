import java.util.*;

public class Main {
  public static void main(String[] args){

    Double a,b;
    String op;
    Double result=0.0;
    Scanner sc = new Scanner(System.in);
    while(true){
      a = Double.parseDouble(sc.next());
      op = sc.next();
      b = Double.parseDouble(sc.next());

      if(op.equals("+")){
        result = a + b;
      }else if(op.equals("-")){
        result = a - b;
      }else if(op.equals("*")){
        result = a * b;
      }else if(op.equals("/")){
        result = a / b;
      }else if(op.equals("?")){
        break;
      }
      System.out.println(result);
    }
  }
}

