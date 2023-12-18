import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] kind = new String[]{"ABC","ARC"};

    String s = sc.next();
    if (s.trim().equals(kind[0])){
      System.out.print(kind[1]);
    } else {
      System.out.print(kind[1]);
    }
  }

}
