import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int w = Integer.parseInt(sc.next());
    int h = Integer.parseInt(sc.next());
    int x = Integer.parseInt(sc.next());
    int y = Integer.parseInt(sc.next());
    String ans;
    int cnt = 0;

	double s = w*h*0.5;

    if (x == w/2 && y == h/2) {
      ans = "1";
    } else {
      ans = "0";
    }
    
    System.out.println(s + " " + ans);
  }
}
