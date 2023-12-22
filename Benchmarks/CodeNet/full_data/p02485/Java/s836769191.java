import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){
      int N = sc.nextInt();
      if(N==0){
        break;
      }
      int x =10;
      int a=N%x;
      int sum=a;
      x *= 10;
      int b;

      while(x/10<=N){
        a = (N-a) % x;
        b = a/(x/10);
        sum += b;
        x *= 10;
      }
      System.out.printf("%d\n",sum);
    }
  }
}