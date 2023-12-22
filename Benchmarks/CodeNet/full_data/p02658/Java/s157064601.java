import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      int N = sc.nextInt();
      long[] A = new long[N];
      long ans = 1;
      boolean hasZero = false;
      for(int i = 0 ; i < N; i++) {
        A[i] = sc.nextLong();
        if(A[i] == 0l) {
          hasZero = true;
          break;
        }
        ans *= A[i];
        
      }
      if(ans > 1000000000000000000l || ans < 0) ans = -1;
      if(hasZero) ans = 0l;
      System.out.println(ans);
    } 
}