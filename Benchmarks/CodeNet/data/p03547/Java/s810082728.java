import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char X = sc.nextChar();
    char Y = sc.nextChar();
    if(X < Y){
      System.out.println("<");
    }
    else if (X == Y){
      System.out.println("=");
    }
    else{
      System.out.println(">");
    }
  }
}
