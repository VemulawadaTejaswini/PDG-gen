import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Christmas_Eve_Eve {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String shown = "Christmas";
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    while (true) {
      try {
        System.out.print("Input arbitraly number:");
        int num = scan.nextInt();
        if (num >= 22 && num <= 25) {
          for (int i = 0; i < 25 - num; i++) {
            shown += " Eve";
          }
          System.out.println(shown);
          shown = "Christmas";
        }
      } catch (java.util.InputMismatchException e) {
        e.printStackTrace();
      }

      try {
        System.out.print("Wanna quit? (y / n)");
        String str = reader.readLine();
        if (str.equals("y")) {
          break;
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
