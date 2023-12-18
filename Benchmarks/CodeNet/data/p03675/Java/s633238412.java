import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<Integer>();
    for(int i = 0; i < n; i++) {
      int a = sc.nextInt();
      list.add(a);
      Collections.reverse(list);
    }
    for(int i = 0; i < n; i++) {
      System.out.print(list.get(i));
      if(i < n - 1) System.out.print(" ");
    }
  }
}