import java.util.*;
import static java.lang.System.*;
import static java.lang.Integer.*;

class Pref extends ArrayList<Integer>{}

class Main {
  public static final int MOD = 1000000007;
  public static final int INF = 1000000000;
  public static void main(String[] args) {
    Scanner sc = new Scanner(in);
    int N = parseInt(sc.next());
    int M = parseInt(sc.next());
    int P[] = new int[M];
    int Y[] = new int[M];
    List<Pref> A = new ArrayList<Pref>(N);
    for(int i=0; i<N; i++){
      Pref B = new Pref();
      A.add(B);
    }      
    for(int i=0; i<M; i++){
      P[i] = parseInt(sc.next());
      Y[i] = parseInt(sc.next());
      A.get(P[i]-1).add(Y[i]);
    }
    for(int i=0; i<N; i++){
      Collections.sort(A.get(i));
    }
    for(int i=0; i<M; i++){
      int x = Collections.binarySearch(A.get(P[i]-1), Y[i]) + 1;
      out.printf("%06d%06d\n",P[i],x);
    }
    
  }
}