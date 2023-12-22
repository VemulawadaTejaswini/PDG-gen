import java.util.Scanner;

class Main{
  public static void main(String args[]){


    while(true){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      String op = sc.next();
      int b = sc.nextInt();

      if(op.equal("?"){break;}

      switch(op){
        case "+" : System.out.println(a+b);
                   break;
        case "-" : System.out.println(a-b);
                   break;
        case "*" : System.out.println(a*b);
                   break;
        case "/" : System.out.println(a/b);
      }
    }
  }
}
