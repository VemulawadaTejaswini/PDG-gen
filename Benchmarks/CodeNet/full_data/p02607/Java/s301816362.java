import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    int n = Integer.parseInt(str);
    str = scan.nextLine();
    String[] strs = str.split(" ");
    int count = 0;
    for (int i = 0; i < n; i+=2) {
      if (Integer.parseInt(strs[i]) % 2 == 1) count++;
    }
    System.out.println(count);
  }
}