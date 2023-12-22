import java.util.Scanner;
import java.util.Random;

class Insertion {
  static void arrayContents(int[] a){
    for(int i = 0;i < a.length;i++){
      if(i < a.length - 1){
        System.out.print(a[i] + " ");
      }
        else{
          System.out.print(a[i]);
        }
    }
    System.out.println();
  }
  public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  int n = scan.nextInt();
  int[] A = new int[n];
  for(int i = 0; i<n;i++){
    A[i] = scan.nextInt();
  }
  for(int i = 1; i < n; i++){
    int v = A[i];
    int j = i-1;
    while(j >= 0 && A[j] > v){
      int t = A[j + 1];
      A[j + 1] = A[j];
      A[j] = t;
      j--;
      arrayContents(A);
    }
  }
  arrayContents(A);
  }
}