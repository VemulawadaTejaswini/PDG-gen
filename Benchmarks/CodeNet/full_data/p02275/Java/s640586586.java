import java.util.*;
import java.io.*;
class Main{
  static  int max = 0;
  static int n;
  public static void main(String args[])throws Exception{
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // n = Integer.parseInt(br.readLine());
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int A[] = new int[n];
    // String s[] = br.readLine().split("\\s+");
    for(int i = 0; i<n; i++){
      // A[i] = Integer.parseInt(s[i]);
      A[i] = sc.nextInt();
      max=Math.max(max,A[i]);
    }
    A = sort(A);
    for(int i = 0; i<n; i++){
      if(i>0)System.out.print(" ");
      System.out.print(A[i]);
    }
    System.out.println();

  }
  static int [] sort(int A[]){
    int C[] = new int[max+1];
    int B[] = new int[n];
    for(int i = 0; i<n; i++){
      C[A[i]]++;
    }
    for(int i = 1; i<=max; i++){
      C[i] = C[i] + C[i-1];
    }
    for(int i = n-1; i>-1; i--){
      B[C[A[i]]-1] =A[i];
      C[A[i]]--;
    }
    return B;
  }
}
