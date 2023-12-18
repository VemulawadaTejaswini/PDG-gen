import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int N = Integer.parseInt(sc.next());
    int X = Integer.parseInt(sc.next());
    int[] L = new int[N];
    for (int i=0; i<N; i++) {
      L[i] = Integer.parseInt(sc.next());
    }
    
    int counter = 0;
    int j = 0;
    while (X >= L[j]) {
      X -= L[j];
      counter++;
      j++;
    }
    
    System.out.print(counter);
  }
}
