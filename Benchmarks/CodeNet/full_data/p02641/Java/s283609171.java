import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int n = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<Integer>();
    for(int i = 0; i < n; i++) {
      list.add(sc.nextInt());
    }
    int a = x;
    int b = x;
    for(int i = x; i >= x - 200; i--) {
      if(!list.contains(i)) {
        a = i;
        break;        
      }
    }
    for(int i = x; i <= x + 200; i++) {
      if(!list.contains(i)) {
        b = i;
        break;        
      }
    }
    int ans = a;
    if(Math.abs(a - x) > Math.abs(b - x)) ans = b;
    System.out.println(ans);
  }
}