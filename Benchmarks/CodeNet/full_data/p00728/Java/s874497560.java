import java.util.Scanner; 
 
public class Main {
   public static void main(String[] args) {
     // ?¨??????\???????????????????????????????????????
     Scanner sc = new Scanner(System.in);
     while (true) {
       int n = sc.nextInt();
       if (n == 0) {
         break;
       }
       int[] scores = new int[n];
       for (int i = 0; i < n; i++) {
         scores[i] = sc.nextInt();
       }
       System.Arrays.sort(scores);
       double average = 0;
       for(int i = 1; i < n-1; i++){
         average = average + scores[i];
       }
       average = average/(n-2);
       System.out.println(Math.floor(average));
     }
   }
} 