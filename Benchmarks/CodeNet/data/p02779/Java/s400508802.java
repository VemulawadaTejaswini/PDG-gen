import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
    A[i] = sc.nextInt();
    }
    
    boolean flg = false;
    for (int i = 0; i < N; i++) {
      int a = A[i];
      
      for (int j = 0; j < N; j++) {
        if (i !=j ) {
          if (a == (A[j])) {
            flg = true;
            break;
          }
        }
      }
    }
    if (flg) {
      System.out.print("NO");
    } else {
      System.out.print("YES");
    }
  }
}