import java.util.Scanner;

class Main{
  public static void main(String[] ags){
    Scanner nyuryoku = new Scanner(System.in);
    int N = nyuryoku.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++){
      A[i] = nyuryoku.nextInt();

      insertionSort(A, N);
      show();
    }
  }
  static void insertionSort(int[] A, int N){
    for(int i = 0; i < N; i++){
      int tmp = A[i];
      int j = i;
      for (j > 0 && A[j] > tmp; j--)
        A[j] = A[j - 1];
      A[j] = tmp;

      show(A, N);
      }
  static void show(int[] A, int N){
    System.out.println(A[0]);
    for (int i = 1; i < N; i++){
      System.out.print(" " + A[i]);
    }
    System.out.println();
  }
    }
  }
}

