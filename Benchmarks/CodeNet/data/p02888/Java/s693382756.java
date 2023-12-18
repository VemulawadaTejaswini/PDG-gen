import java.util.Scanner;
import java.util.Arrays;

public class Solution {

   public static void main(String[] args) {
   
      Scanner sc = new Scanner(System.in);
      
      int N = sc.nextInt();
      int[] L = new int[N];
      for(int i=0;i<N;i++) {
         L[i] = sc.nextInt();
      }
      Arrays.sort(L);
      int ans = 0;
      for(int i=0;i<N-2;i++) {
         for(int j=i+1;j<N-1;j++) {
            int ij = L[i]+L[j];
            int w = j+1;
            while(w < N && L[w] < ij) {
               ans++;
               w++;
            }
         }
      }
      
      System.out.println(ans);
   }
}