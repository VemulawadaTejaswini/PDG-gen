import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    char[] ch = new char[str.length()];
    int[] n = new int[str.length()];
    int nSum = 0;
    for (int i = 0; i < str.length(); i++) {
      ch[i] = str.charAt(i);
      n[i] = Character.getNumericValue(ch[i]);
      nSum += n[i];
    }
    
    if (nSum % 9 == 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}