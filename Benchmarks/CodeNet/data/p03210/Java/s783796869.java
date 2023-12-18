import java.util.*;

class Main {
  public static boolean isCelemonyHeld(int age) {
    return (age == 3 || age == 5 || age == 7) ? true : false;
  }
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int age = Integer.parseInt(scanner.nextLine());
    String result = isCelemonyHeld(age) ? "Yes" : "No";
    
    System.out.println(result);
  }
}