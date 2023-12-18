import java.util.Scanner;
public class Main {
  
 public static void main(String[] args)
 {
  Scanner scan = new Scanner(System.in);
  int a = scan.nextInt();
  int b = scan.nextInt();
  int ans = a+b < a-b ? a-b:a+b;
  ans = ans < a*b ? a*b:ans;
  System.out.println(ans);
 }

}
