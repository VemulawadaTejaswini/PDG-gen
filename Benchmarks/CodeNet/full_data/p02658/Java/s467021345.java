import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int N = sc.nextInt();
      long[] A = new long[N];
      long ans = 1l;
      boolean hasZero = false;
      long max = (long) Math.pow(10,18);
      for(int i = 0 ; i < N; i++) A[i] = sc.nextLong();
      for(int i = 0 ; i < N; i++){
        if(A[i] == 0l) {
          hasZero = true;
          break;
        }
      }
      if(hasZero) {
        ans = 0l;
      } else {
        for(int i = 0 ; i < N; i++){
          ans *= A[i]; 
          if(ans > max || ans < 0) {
            ans = -1;
            break;
          }
        }
      }
      System.out.println(ans);
    } 
}
