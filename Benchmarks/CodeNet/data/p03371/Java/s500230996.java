import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    long ans = Long.MAX_VALUE;
    for(int i = 0; i <= Math.max(x, y); i++){
      long temp = 2*i*c + a*Math.max(0,x-i) + b*Math.max(0,y-i);
      if(temp < ans){
        ans = temp;
      }
    }
    System.out.println(ans);
  }
}