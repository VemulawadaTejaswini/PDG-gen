import java.util.Scanner;

public class Main {
  
  public static void Print_Array(int[] A){
    int n = A.length;
    for(int i=0;i<n-1;i++){
      System.out.print(A[i] + " ");
    }
    System.out.println(A[n-1]);
  }
  
  public static void Sellection_Sort(int[] A){
    int minj;
    int count = 0;
    for(int i=0;i<A.length;i++){
      minj = i;
      for(int j=i+1;j<A.length;j++){
        if(A[j]<A[minj]){
          minj = j;
        }
      }
      if(i != minj){
        swap(A, i, minj);
        count++;
      }
    }
    Print_Array(A);
    System.out.println(count);
  }

  public static void swap(int[] A, int a, int b){
    int m = A[a];
    A[a] = A[b];
    A[b] = m;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for(int i=0;i<N;i++){
      A[i] = sc.nextInt();
    }
    sc.close();
    Sellection_Sort(A);
  }
}
