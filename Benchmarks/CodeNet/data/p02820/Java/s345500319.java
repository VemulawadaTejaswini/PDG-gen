import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = Integer.parseInt(stdIn.next());
    int k = Integer.parseInt(stdIn.next());
    int r = Integer.parseInt(stdIn.next());
    int s = Integer.parseInt(stdIn.next());
    int p = Integer.parseInt(stdIn.next());
    String t = stdIn.next();
    String[] tChar = t.split("");
    String[] tkhs = new String[n];

    int point = 0;
    for (int i = 0; i < n; i++) {
      if (tChar[i].equals("r")) tkhs[i] = "p";
      else if (tChar[i].equals("s")) tkhs[i] = "r";
      else if (tChar[i].equals("p")) tkhs[i] = "s";
      if (i >= k && tkhs[i].equals(tkhs[i - k])) tkhs[i] = tChar[i];
      if (tkhs[i].equals("r") && tChar[i].equals("s")) point += r;
      else if (tkhs[i].equals("s") && tChar[i].equals("p")) point += s;
      else if (tkhs[i].equals("p") && tChar[i].equals("r")) point += p;
    }

    System.out.println(point);
  }
}
