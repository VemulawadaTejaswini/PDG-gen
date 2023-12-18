import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int T = sc.nextInt();
    ArrayList<Integer> profit = new ArrayList<Integer>();
    int min = sc.nextInt();
    int p = min;
    for(int i = 1; i < N; i++) {
      int a = sc.nextInt();
      if(a > p) {
        p = a;
        if(i == N - 1) profit.add(p - min);       
      } else {
        profit.add(p - min);
        min = a;
        p = min;
      }
    }
    Collections.sort(profit);
    Collections.reverse(profit);
    int cost = 1;
    int max = profit.get(0);
    for(int i = 1; i < profit.size(); i++) {
      if(max == profit.get(i)) {
        cost++;
      } else {
        break;
      }
    }
    System.out.println(cost);
  }
}
