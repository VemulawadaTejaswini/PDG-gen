import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    
    char[] chars = Integer.toString(n).toCharArray();
    for (char c : chars) {
      if (c == '7') {
        System.out.println("Yes");
        return;
      }
    }
    System.out.println("No");
  }
}
