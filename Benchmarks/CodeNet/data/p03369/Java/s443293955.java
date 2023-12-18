import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int res = 700;
      for (char c: s.toCharArray()) {
      	if (c =='o') { res += 100; }
      }
      System.out.println(res);
    }
}