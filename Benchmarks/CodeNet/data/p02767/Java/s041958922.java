import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int x[] = new int[n];
    for(int i = 0; i < n; i ++){
      x[i] = scan.nextInt();
    }
    int answer =　10000;
    for(int i = 0; i < 100; i ++){
      int sum = 0;
      for(int j = 0; j < n; j ++){
        sum += Math.pow((a[j]-i),2);
      }
      if(answer > sum){
        answer = sum;
      }
    }
    System.out.println(sum);
  }
}