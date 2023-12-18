import java.util.*;

public class Main {
  
  public class Drink implements Comparable<Drink> {
    public int A;
    public int B;
    public Drink(int a, int b) {
      this.A = a;
      this.B = b;
    }
    
    @Override
    public int compareTo(Drink other) {
      return this.A - other.A;
    }
  }
  
  public long solve(Scanner sc, int N, int M) {
    
    List<Drink> list = new ArrayList<>();
    for (int i=0; i<N; i++) {
      list.add(new Drink(sc.nextInt(), sc.nextInt()));
    }
    Collections.sort(list);
    
    long totalYen = 0L;
    for (int i=0; i<list.size(); i++) {
      Drink d = list.get(i);
      int n = M > d.B ? d.B : M;
      totalYen += (long)(n*d.A);
      M -= n;
      if (M == 0)
        break;
    }
    return totalYen;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N, M;
    N = sc.nextInt();
    M = sc.nextInt();
    
    Main C = new Main();
    System.out.println(C.solve(list, N, M));
    return;
  }
}
