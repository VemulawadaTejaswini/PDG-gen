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
       for (int i = 0; i < scores.length; i++) {
         scores[i] = sc.nextInt();
       }
       double average = 0, variance = 0, Total = 0, TotalA = 0;
       // ??? ?????????average??¨????????£variance????¨?????????????
       for (int i = 0; i < n; i++) ){
         Total = Total + scores[i];
       }
       average = Total/n;
       for (int i = 0; i < n; i++) ){
         TotalA = TotalA + (scores[i] - average)^2;
       }
       variance = (Total/n)^-2;
       System.out.println(Math.sqrt(variance));
     }
   }
 }