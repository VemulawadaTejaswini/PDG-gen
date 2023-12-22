import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String W = reader.next().toLowerCase();
    int count = 0;
    while(true) {
      String T = reader.next().toLowerCase();
      if (T.indexOf(W) != -1) count++;
      else if (T.equals("end_of_text"))  break;
    }
    System.out.println(count);
  }
}