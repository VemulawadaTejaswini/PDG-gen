import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String one = in.nextLine();
    String two = in.nextLine();
    int count = 0;
    while(!one.isEmpty()) {
      char firstOne = one.charAt(0);
      char firstTwo = two.charAt(0);
      if(firstOne!=firstTwo) count++;
    }
    System.out.println(count);
  }
}
