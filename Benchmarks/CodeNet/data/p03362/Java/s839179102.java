import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    List<Integer> list = new ArrayList<Integer>();
    int n = 2;
    while (list.size() < N) {
      if (isPrime(n) && n%5 == 1) {
        list.add(n);
      }
      n++;
    }
    
    StringBuilder ans = new StringBuilder();
    for (int i = 0; i < N; i++) {
      ans.append(list.get(i)).append(' ');
    }
    
    System.out.println(ans.toString());
  }
  
  private static boolean isPrime(int a) {
    for (int i = 2; i*i <= a; i++) {
      if (a%i == 0) return false;
    }
    return true;
  }
}