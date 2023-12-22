import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Set<String> A = new HashSet<String>();
    for (int i=0; i<N; i++) {
      A.add(sc.next());
    }
    
    System.out.println(A.size());
  }
}  