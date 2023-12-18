import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int t = Integer.parseInt(sc.next());

	int ans = t/a*b;
    
    System.out.println(ans);
  }
}
