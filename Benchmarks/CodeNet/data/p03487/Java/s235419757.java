import java.util.*;

public class Main { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Set<Integer> setA = new HashSet<Integer>();
    List<Integer> listA = new ArrayList<Integer>();
    for (int i =1; i<=N; i++) {
      int a = sc.nextInt();
      listA.add(a);
      setA.add(a);
    }
    int ans = 0;
    for (int i : setA) {
      int frequency = Collections.frequency(listA,i);
      if (frequency > i ) {
        ans += frequency - i;
      } else if (frequency < i) {
        ans += frequency;
      }
    }
    ans = Math.min(ans,N);
    System.out.println(ans);
  }
}