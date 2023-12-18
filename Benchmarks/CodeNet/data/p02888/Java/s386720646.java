import java.util.*;

class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = Integer.parseInt(sc.next());
      int[] L = new int[N];
      
      for (int i = 0; i < N; ++i) {
        L[i] = Integer.parseInt(sc.next());
      }
      
      int result = 0;
      
      for (int i = 0; i < N - 2; ++i) {
        for (int j = i + 1; j < N - 1; ++j) {
          for (int k = j + 1; k < N; ++k) {
            result += isTriangle(L[i], L[j], L[k]) ? 1 : 0;
          }
        }
      }
      
      
      System.out.println(result);
    }
  
  public static boolean isTriangle(int a, int b, int c) {
    return a < b + c && b < a + c && c < a + b;
  }

}