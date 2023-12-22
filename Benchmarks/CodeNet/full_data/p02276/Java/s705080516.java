import java.util.*;
class Main{
  public static void main(String args[]){
    StringBuilder bl = new StringBuilder();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int A[] = new int[n];
    for(int i = 0; i<n; i++){
      A[i] = sc.nextInt();
    }
    int i = partition(A,0,A.length-1);
    if(0==i)bl.append('[').append(A[0]).append(']');
    else bl.append(A[0]);
    for(int j = 1; j<A.length; j++){
      if(j==i)bl.append(' ').append('[').append(A[j]).append(']');
      else bl.append(' ').append(A[j]);
    }
    System.out.println(bl);

  }
  static int partition(int A[], int p, int r){
    int x = A[r];
    int i = p-1;
    int tmp;
    for(int j =p; j<r; j++){
      if(A[j]<=x){
        i = i+1;
        tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
      }
    }
    tmp = A[i+1];
    A[i+1] = A[r];
    A[r] = tmp;
    return i+1;
  }
}
