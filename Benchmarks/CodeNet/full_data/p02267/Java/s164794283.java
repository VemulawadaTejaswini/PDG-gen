import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] s = new int[n];
    for(int i = 0; i < n; i++) {
      s[i] = sc.nextInt();
    }
    int q = sc.nextInt();
    int[] t = new int[q];
    for(int i = 0; i < q; i++) {
      t[i] = sc.nextInt();
    }
    int count = 0;
    List<Integer> same = new ArrayList<>();
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < q; j++) {
        if(s[i] == t[j] && !same.contains(s[i])) {
          same.add(s[i]);
          count++;
        }
      }
    }
    System.out.println(count);
  }
}

