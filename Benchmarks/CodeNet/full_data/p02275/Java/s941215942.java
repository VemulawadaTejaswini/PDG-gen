import java.util.*;
import java.io.*;
class Main{
  public static void main(String args[])throws Exception{
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // n = Integer.parseInt(br.readLine());
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int A[] = new int[n];
    int B[] = new int[n];
    int max = 0;
    StringBuilder builder = new StringBuilder();
    // String s[] = br.readLine().split("\\s+");
    for(int i = 0; i<n; i++){
      // A[i] = Integer.parseInt(s[i]);
      A[i] = sc.nextInt();
      max=Math.max(max,A[i]);
    }
    sort(A,B,max);
    // for(int i = 0; i<n; i++){
    //   if(i>0)System.out.print(" ");
    //   System.out.print(B[i]);
    // }
    // System.out.println();
    builder.append(B[0]);
    for (int i = 1; i < n; i++) {
        builder.append(' ').append(B[i]);
    }
    System.out.println(builder);

  }
  static void sort(int A[] , int B[] , int max){
    int C[] = new int[max+1];
    for(int i = 0; i<A.length; i++){
      C[A[i]]++;
    }
    for(int i = 1; i<=max; i++){
      C[i] += C[i-1];
    }
    for(int i = A.length-1; i>-1; i--){
      B[C[A[i]]-1] =A[i];
      C[A[i]]--;
    }
  }
}
