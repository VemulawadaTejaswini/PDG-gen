import java.util.*;

public class Main {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    int N = sc.nextInt();
    ArrayList<Integer> A = new ArrayList(N);

    for (int i=0; i<N; i++) {
      A.add(sc.nextInt());
    }

    A.sort((x, y) -> y-x);

    ArrayList<Integer> removeList = new ArrayList();
    for (int i=0; i<N; i++) {
      for (int j=i+1; j<N; j++) {
        if (A.get(i) % A.get(j) == 0) {
          removeList.add(0, i);
          break;
        }
      }
    }

    //添字が大きいほうから削除していく
    for (int i=0; i<removeList.size(); i++) {
      A.remove((int)removeList.get(i));
    }

    int min = A.get(0);

    for (int i=0; i<A.size(); i++) {
      for (int j=i+1; j<A.size(); j++) {
        min = Math.min(min, gcd(A.get(i), A.get(j)));
        A.set(i, min);
        A.set(j, min);
      }
    }

    System.out.println(min);
  }

  static int gcd(int a, int b) {
    if (b == 1) return 1;
    if (b == 0) return a;
    return gcd(b, a%b);
  }

}
