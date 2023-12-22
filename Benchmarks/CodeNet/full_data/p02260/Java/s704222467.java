// ALDS1_2_B Selection Sort
import java.io.*;

class Main {
   public static void main(String[] args) {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      try {  
         int N = Integer.parseInt(br.readLine());
         String[] inputAry = br.readLine().split(" ");
         int[] A = new int[N];
         for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(inputAry[i]);
         }
         selectionSort(A, N);
      }
      catch (Exception e) {
         e.printStackTrace();
      }
   }
   static void selectionSort(int[] A, int N) {
      int tmp, minj, cnt = 0;
      for (int i = 0; i < N; i++) {
         minj = i;
         for (int j = i; j < N; j++) {
            if (A[j] < A[minj]){
               minj = j;
            }
         }
         if (i != minj) {
            tmp = A[i];
            A[i] = A[minj];
            A[minj] = tmp;
            cnt++;
         }
      }
      for (int i = 0; i < N; i++) {
         if (i == N - 1) {
            System.out.println(A[i]);
         } else {
            System.out.print(A[i] + " ");
         }
      }
      System.out.println(cnt);
   }
}