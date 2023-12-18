import java.util.*;

class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = Integer.parseInt(sc.next());
      int[] d = new int[N];
      for (int i = 0; i < N; ++i) {
        d[i] = Integer.parseInt(sc.next());
      }
      
      int result = 0;
      for (int i = 0; i < N; ++i) {
        for (int j = i + 1; j < N; ++j) {
          result += d[i] * d[j];
        }
      }
      
      
      System.out.println(result);
    }

}