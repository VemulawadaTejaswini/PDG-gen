import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int A = scan.nextInt();
    int B = scan.nextInt();
    int ans = 0;
    int x = 1;
    while(x < B){
      x --;
      x += A;
      ans ++;
    }
    System.out.println(ans);
  }
}