import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long S = sc.nextLong();
    long w = 1;
    do {
      w += (long) (S % w);
      if (String.valueOf(w).length() > 9 || String.valueOf(S / w).length() > 9)
        w++;
      else
        break;
    } while ((long) (S % w) != 0);
    StringBuilder builder = new StringBuilder();
    builder.append(0).append(' ').append(0).append(' ');
    builder.append(w).append(' ').append(0).append(' ');
    builder.append(0).append(' ').append((long) S / w).append(' ');
    System.out.println(builder.toString());
  }
}