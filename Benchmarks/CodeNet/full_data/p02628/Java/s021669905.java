import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int  n = sc.nextInt();
     int k = sc.nextInt();
     int[] alpha = new int[N];
     for(int i=0;i<N;i++){
       alpha[i]= sc.nextInt();
     }
     for (int j = 1; j < alpha.length; j++) {
            int key = alpha[j];
            i = j - 1;
            while (i >= 0 && alpha[i] > key) {
                alpha[i + 1] = alpha[i];
                i--;
            }
            alpha[i + 1] = key;
        }
     System.out.println(alpha[0]+alpha[1]+alpha[2]+alpha[3]);

   }
   
}
