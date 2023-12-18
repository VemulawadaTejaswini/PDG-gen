import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // 入力
    try (Scanner sc = new Scanner(System.in);) {
      String line = sc.nextLine();



      int sum = 0;

      String tmp = line;
      while (true) {
        int zeroone = tmp.indexOf("01");
        int onezero = tmp.indexOf("10");
        if (0 <= zeroone && (onezero < 0 || zeroone < onezero)) {
          String first = tmp.substring(0, zeroone);
          String second = tmp.substring(zeroone+2);
          tmp = first + second;
          sum += 2;
          continue;
        }
        if (0 <= onezero && (zeroone < 0 || onezero < zeroone)) {
          String first = tmp.substring(0, onezero);
          String second = tmp.substring(onezero+2);
          tmp = first + second;
          sum += 2;
        }
        if(zeroone < 0 && onezero < 0) {
          break;
        }
      }
      System.out.println(sum);
    }
  }
}