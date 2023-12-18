import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      int M = sc.nextInt();
      List<Entry> entryList = new LinkedList<>();
      for ( int j = 0; j < M; j++ ) {
        int P = sc.nextInt();
        int Y = sc.nextInt();
        entryList.add(new Entry(j+1, P, Y));
      }
      List<Entry> calcList = new LinkedList<>(entryList);
      Collections.sort(calcList
          , new Comparator<Entry>() {
                public int compare(Entry o1, Entry o2) {
                  return o1.Y - o2.Y;
                }
          }
          );
      Map<Integer,Integer> orderMap = new HashMap<Integer,Integer>();
      for ( Entry entry : calcList ) {
        int P = entry.P;
        Integer order = orderMap.get(P);
        if ( order == null ) {
          order = 1;
        }
        else {
          order = order.intValue() + 1;
        }
        entry.setIdBy(order);
        orderMap.put(P, order);
      }
      for ( Entry entry : entryList ) {
        System.out.println(entry.id);
      }
    }
  }
  
  private static class Entry {
    private final int i;
    private final int P;
    private final int Y;
    
    private volatile String id;
    
    public Entry(int i, int P, int Y) {
      this.i = i;
      this.P = P;
      this.Y = Y;
    }
    
    public void setIdBy(int x) {
      id = String.format("%06d%06d", P, x);
    }
  }
}