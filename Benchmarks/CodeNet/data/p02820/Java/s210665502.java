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

    String[] taka = new String[n];
    for (int i = 0; i < n; i++) {
      if (tChar[i].equals("r")) taka[i] = "p";
      else if (tChar[i].equals("s")) taka[i] = "r";
      else if (tChar[i].equals("p")) taka[i] = "s";
    }

    for (int i = k; i < n; i++) {
      if (taka[i].equals(taka[i - k])) taka[i] = tChar[i];
    }

    int point = 0;
    for (int i = 0; i < n; i++) {
      if (taka[i].equals("r") && tChar[i].equals("s")) point += r;
      else if (taka[i].equals("s") && tChar[i].equals("p")) point += s;
      else if (taka[i].equals("p") && tChar[i].equals("r")) point += p;
    }

    System.out.println(point);
  }
}
