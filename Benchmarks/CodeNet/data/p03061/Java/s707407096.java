import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A[] = new int[N+1];
    for (int i=0; i<N; i++) {
      A[i] = sc.nextInt();
    }
    int out = 0;
    int tempgcd = 0;
    for (int k=0; k<=N-1; k++) {
      tempgcd = A[0];
      if(k == 0){
        tempgcd = A[1];
      }
      for (int i=1; i<=N-1; i++) {
        if(i == k){
          i++;
        }
        tempgcd = gcd(tempgcd, A[i]);
      }
      if(tempgcd > out){
        out = tempgcd;
      }
    }
    System.out.println(out);
  }

  public static int gcd(int num1, int num2) {
    if(num2 == 0) {
      return num1;
    } else {
      return gcd(num2, num1 % num2);
    }
  }
}
