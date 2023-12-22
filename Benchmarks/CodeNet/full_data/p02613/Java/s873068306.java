import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int acN = 0;
    int waN = 0;
    int tleN = 0;
    int reN = 0;
    for (int cnt = 0; cnt < n; cnt++) {
      String input = sc.next();
      if (input.equals("AC")) {
        acN++;
      }
      if (input.equals("WA")) {
        waN++;
      }
      if (input.equals("TLE")) {
        tleN++;
      }
      if (input.equals("RE")) {
        reN++;
      }
    }

    System.out.println("AC x " + acN);
    System.out.println("WA x " + waN);
    System.out.println("TLE x " + tleN);
    System.out.println("RE x " + reN);
    sc.close();
  }
}
