import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double A = sc.nextInt();
    double B = sc.nextInt();
    double N = sc.nextInt();
    double max = 0;
    for(double i =1;i<=N;i++){
      double ans = (double)(Math.floor(A*i/B) - A*Math.floor(i/B));
      max = Math.max(ans,max);
    }

    System.out.println(max);  
  }
}



