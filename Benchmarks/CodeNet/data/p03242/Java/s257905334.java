import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String input = sc.next();
    char in[] = new char[3];
    for (int i = 0; i < 3; i++) {
      in[i] = input.charAt(i);
      if (in[i] == '1') {
        in[i] = 9;
      } else if (in[i] == '9') {
        in[i] = 1;
      }
    }

    int ans = in[0] * 100 + in[1] * 10 + in[2];
    System.out.println(ans);
  }
}