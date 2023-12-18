import java.util.*;

	public class Main {

		public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int[] A = new int[N]; 
		for (int i = 0; i < N; i++) {
          A[i] = sc.nextInt();
		}
          
        for (int i = 0; i < N; i++) {
          int tmp = A[i];
          A[i] = 0;
          int max = A[i];
           for (int j = 0; j < N; j++) {
             if(A[j]>max){
               max = A[j];
             }
           }
         System.out.println(max);
          A[i] = tmp;
        }
  }
}