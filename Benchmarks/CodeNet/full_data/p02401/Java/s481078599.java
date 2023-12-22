import java.io.CharArrayReader;
import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){
    int a = sc.nextInt();
    String op = sc.next();
    int b = sc.nextInt();
    char c = op.charAt(0);
    if(c == '+'){
      System.out.println(a + b);
    }else if(c == '-'){
      System.out.println(a - b);
    }else if(c == '*'){
      System.out.println(a * b);
    }else if(c == '/'){
      System.out.println(a / b);
    }else if(c == '?'){
      break;
    }
  }
  }
}

