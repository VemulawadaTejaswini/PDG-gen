import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    char strChar = str.charAt(0);
    int code = (int)strChar;
    char out = (char)(code+1);
    
    System.out.println(out);

  }
}
