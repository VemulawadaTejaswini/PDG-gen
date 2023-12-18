import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int i = 0;
    double ans = 0;
    for(i = 0; i < N; i++){
      ans += 1 / sc.nextDouble();
    }
    System.out.print(1 / ans);
  }
}