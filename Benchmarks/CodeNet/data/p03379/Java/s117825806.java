import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    ArrayList<Integer> X = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      X.add(sc.nextInt());
    }
    for (int i = 0; i < N; i++) {
      ArrayList<Integer> tmp = new ArrayList<>(X);
      tmp.remove(i);
      Collections.sort(tmp);
      System.out.println(tmp.get(N / 2 - 1));
    }
  }
}