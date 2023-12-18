import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);    
    String str = scan.next();
    scan.close();

    String[] split = str.split("");
    
    if(split[2].equals(split[3]) && split[4].equals(split[5])) {
      System.out.println("Yes");
    }else {
      System.out.println("No");
    }
    
  }
}
