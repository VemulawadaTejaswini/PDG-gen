import java.util.*;

public class Main {
  public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int[] A = new int[n];
   for(int i = 0;i < n;i++) A[i] = sc.nextInt();

   int p = 0;
   int r = n - 1;
   int x = A[r];
   int i = p - 1;
   int tmp,tmp2;
   for(int j = p;j < r;j++){
     if(A[j] <= x){
      i++; 
      tmp = A[i];
      A[i] = A[j];
      A[j] = tmp;
    }    
   }
   tmp2 = A[i + 1];
   A[i + 1] = A[r];
   A[r] = tmp2;
   int par = i + 1; 
   for(int j = 0;j < n;j++){
    if(j == par) System.out.print("["+A[j]+"]");
    else System.out.print(A[j]);
    if(j != n - 1) System.out.print(" ");
   }
   System.out.println();
  }
}
