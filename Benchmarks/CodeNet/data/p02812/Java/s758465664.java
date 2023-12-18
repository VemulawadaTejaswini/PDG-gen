import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    Pattern p = Pattern.compile("ABC");
    Matcher m = p.matcher(s);
    int count = 0;
    while (m.find())
      count++;
    System.out.println(count);
  }
}