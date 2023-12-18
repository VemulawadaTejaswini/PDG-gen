import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int N = Integer.parseInt(sc.next());
    int X = Integer.parseInt(sc.next());
    int[] L = new int[N+1];
    L[0] = 0;
    for (int i=1; i<N+1; i++) {
      L[i] = Integer.parseInt(sc.next());
      L[i] += L[i-1];
    }
    
    int cnt = 0;
    for (int i=0; i<N+1; i++) {
      if (L[i] <= X) cnt++;
      else break;
    }
    
    System.out.print(cnt);
  }
}
