import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final int shift = sc.nextInt();
    final String text = sc.next();
    final int offset = (int) 'A';
    int[] cpArray = text.codePoints().map(cp -> ((cp - offset + shift) % 26) + offset).toArray();
    System.out.println(new String(cpArray, 0, cpArray.length));
  }
}