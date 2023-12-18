import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    StringTokenizer st = new StringTokenizer(s.next(), ",");
    String a = st.nextToken();
    String b = st.nextToken();
    String c = st.nextToken();
    System.out.println(a + " " + b + " " + c)
  }
}
