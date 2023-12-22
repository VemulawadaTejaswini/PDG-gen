import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] n = sc.next().toCharArray();
    int sum = 0;
    for (char nn : n) {
      sum += Character.getNumericValue(nn);
    }
    String ans = sum % 9 == 0 ? "Yes" : "No";
    System.out.println(ans);
    sc.close();
  }
}
