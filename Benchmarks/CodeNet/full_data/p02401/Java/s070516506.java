import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int a,b;
    String C="Start";
    while(!(C.equals("?"))){
      a = scanner.nextInt();
      C = scanner.next();
      b = scanner.nextInt();
      if(!(C.equals("?"))){
        switch(C){
          case "+": System.out.println(a+b);break;
          case "-": System.out.println(a-b);break;
          case "*": System.out.println(a*b);break;
          case "/": System.out.println(a/b);break;
        }
      }
    }
  }
}

