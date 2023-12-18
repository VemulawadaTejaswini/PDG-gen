import java.util.*;

public class Main {
  public static void main(String[] args) {
    int N;
    int[] A;
    try(Scanner sc = new Scanner(System.in)) {
      N = sc.nextInt();
      A = new int[N];
      for(int i = 0; i < N; i++) {
        A[i] = sc.nextInt();
      }
    }
    List<MyNumber> vlist = new ArrayList<MyNumber>();
    for(int i = 0; i < N; i++) {
      vlist.add(new MyNumber(i, A[i]));
    }
    Collections.sort(vlist);
    for(int i = 0; i < N; i++) {
      int v = -1;
      for(int j = N-1; j > -1; j--) {
        MyNumber num = vlist.get(j);
        if ( num.hasIndex(i) == false ) {
          v = num.getValue();
          break;
        }
      }
      System.out.println(v);
    }
  }
  
  private static class MyNumber 
    		implements Comparable<MyNumber> 
  {
    private final int index;
    private final int value;
    
    public MyNumber(int index, int value) {
      this.index = index;
      this.value = value;
    }
    
    @Override
    public int compareTo(MyNumber o) {
      if ( o == null ) {
        return 1;
      }
      if ( value > o.value ) {
        return 1;
      }
      else if ( value < o.value ) {
        return -1;
      }
      return 0;
    }
    
    public boolean hasIndex(int index) {
      return index == this.index;
    }
    
    public int getValue() {
      return value;
    }
  }
}