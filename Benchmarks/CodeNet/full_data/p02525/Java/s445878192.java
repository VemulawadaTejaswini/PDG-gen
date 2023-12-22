import java.util.Scanner;

 public class Standarddeviation{
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     while(true) {
       int n = sc.nextInt();
       if (n == 0){ break; }
       int[] scores = new int [n];
       for (int i = 0; i < scores.length; i++){
         scores[i] = sc.nextInt();
       }
       double average = 0, variance = 0;
       for(int i = 0; i < n; i++){
         average += scores[i];
       }
       average = (average * 1.0) / n;
       for(int i = 0; i < n; i++){
         variance += (score[i] - average) * (Scores[i] - average);
       }
       variance /= n;       
       System.out.println(Math.sqrt(variance));
     }
   }
 }