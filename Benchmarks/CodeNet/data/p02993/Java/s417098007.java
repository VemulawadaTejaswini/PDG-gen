import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System. in);
    String passWord = sc.next();

    for (int i=0; i < passWord.length(); i++) {
      if (passWord.substring(i, i + 1).equals(passWord.substring(i+1, i+2))) {
        System.out.println("Bad");
        return;
      } else {
        System.out.println("Good");
        return;
      }
    }
  }
}