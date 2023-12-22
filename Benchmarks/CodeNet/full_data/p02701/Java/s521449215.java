import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Set<String> prizeTypes = new HashSet<>();
    for (int i = 0; i < N; i++) {
      prizeTypes.add(sc.next()); 
    }
    System.out.println(prizeTypes.size());
  }
}
