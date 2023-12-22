import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){
      int n = sc.nextInt();
      if(n==0) break;
      int[] scores = new int[n];
      double sum = 0.0;
      for(int i=0; i<scores.length; i++){
        scores[i] = sc.nextInt();
        sum+=scores[i];
      }
      double average = 0, variance = 0;
      average = sum/n;
      sum=0.0;
      for(int i=0; i<scores.length; i++){
        sum+=Math.pow((scores[i]-average),2);
      }
      variance=sum/n;
      System.out.println(Math.sqrt(variance));
    }
  }
}