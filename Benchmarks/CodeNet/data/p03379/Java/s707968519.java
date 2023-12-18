import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    ArrayList<Integer> x = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      x.add(sc.nextInt());
    }

    for (int i = 0; i < N; i++) {
      int tmp = x.get(i);
      x.remove(i);
      int mid = ((N - 1) / 2);
      System.out.println(x.get(mid));
      x.add(i, tmp);
    }

  }
}