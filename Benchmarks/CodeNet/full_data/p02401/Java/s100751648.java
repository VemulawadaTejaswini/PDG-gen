import java.util.Scanner;

class Main
{
  public static int calc(int a, String op, int b){
    if(op.equals("?")) return 0;
    else{
      if(op.equals("+")) System.out.println(a+b);
      else if(op.equals("-")) System.out.println(a-b);
      else if(op.equals("*")) System.out.println(a*b);
      else if(op.equals("/")) System.out.println(a/b);
      return 1;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b;
    String op;
    while(true){
      a  = sc.nextInt();
      op = sc.next();
      b = sc.nextInt();
      if(calc(a, op, b) == 0) break;
    }
  }
}