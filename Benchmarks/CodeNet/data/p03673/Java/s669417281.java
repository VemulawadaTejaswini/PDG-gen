import java.util.Scanner;
 
public class Main {
 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int length = sc.nextInt();
    
    String str[] = new String[length];
    
    for (int i = 0; i < str.length; i++) {
      str[i] = sc.next();
    }
    
    if (length == 1) {
      System.out.println(str[0]);
    } else {
      String b = "";
      for (int i = 0; i < length; i++) {
        b += str[i];
        b = new StringBuffer(b).reverse().toString();
        b += " ";
      }
 
      System.out.println(b);
    }
 
    
  }
 
}