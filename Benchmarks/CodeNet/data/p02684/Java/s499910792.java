import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long K = sc.nextLong();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) A[i] = sc.nextInt();
    int c = 1;
    List<Integer> order = new ArrayList<>();
    while (!order.contains(c)) {
      order.add(c);
      c = A[c-1];
    }
    
    int cSize = order.size();
    for (int i = 0; i < order.size(); i++) {
      if (order.get(i) == c) {
        cSize -= i;
        break;
      }
    }
    int lSize = order.size() - cSize;
    int ans = lSize + (int)((K-lSize) % cSize);
    System.out.println(order.get(ans));
  }
  
}
