
import java.util.Scanner;

public class Main {
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      if(Character.isUpperCase(str.charAt(0))) {
        System.out.println("A");
      }else {
        System.out.println("a");
      }
  }
}
