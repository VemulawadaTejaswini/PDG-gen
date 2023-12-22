import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    try(Scanner sc = new Scanner(System.in)){
      while(true){
        int n = sc.nextInt();
        if(n == 0)break;
        int[] scores = new int[n];
        int sum = 0;
        for(int i=0;i<scores.length;i++){
          scores[i] = sc.nextInt();
          sum += scores[i];
        }
        double average = (double)sum / n,variance = 0;
        for(int i=0;i<scores.length;i++){
          variance += (double)((scores[i] - average)  * (scores[i] - average));
        }
        variance = (double)variance / n;
        System.out.printf("%.10f\n",Math.sqrt(variance));
      }
    }
  }
}

