import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] count = new int[200000];
    Set<Integer> setA = new HashSet<Integer>();
    int ans =0;
    for (int i =0; i<N; i++) {
      int A = sc.nextInt();
      count[A]++;
      setA.add(A);
    }
    if (setA.size() <= K) {
      System.out.println(0);
      return;
    }
    int b =0;
    while (setA.size() > K) {
      int min =200000, a =0;
      for (int i : setA) {
        min =Math.min(count[i],min);
      }
      for (int i : setA) {
        if (count[i] == min) a = i;
      }
      ans += min;
      setA.remove(a);
    }
    System.out.println(ans);  
  }
}