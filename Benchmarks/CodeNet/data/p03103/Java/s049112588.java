import java.util.*;

public class Main {
  
  public static class Drink {
    public int A;
    public int B;
    public Drink(int a, int b) {
      A = a;
      B = b;
    }
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N, M;
    N = sc.nextInt();
    M = sc.nextInt();
    
    long totalYen = 0L;
    List<Drink> list = new ArrayList<>();
    for (int i=0; i<N; i++) {
      list.add(new Drink(sc.nextInt(), sc.nextInt()));
    }
    Collections.sort(list, new Comparator<Drink>() {
      @Override
      public int compare(Drink d1, Drink d2) {
        return d1.A-d2.A;
      }
    });
    
    for (int i=0; i<list.size(); i++) {
      Drink d = list.get(i);
      long yen = d.A*d.B;
      if (M - d.B > 0) {
        totalYen += yen;
        M -= d.B;
      } else if (M - d.B <= 0) {
        totalYen += M*d.A;
        break;
      }
    }
    System.out.println(totalYen);
    return;
  }
}
