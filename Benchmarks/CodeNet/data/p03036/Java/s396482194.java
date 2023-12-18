import java.util.*;

public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int r = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());
      for (int y = 1; y <= 10; y++) {
        x = r*x - d;
        System.out.println(x);
      }
  }
}