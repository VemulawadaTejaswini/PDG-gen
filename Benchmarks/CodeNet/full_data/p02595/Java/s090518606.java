import java.util.Scanner;
public class Main(){
  public static void (String[] args){
    Scanner scan = new Scanner (System.in);
    int n;
    long d;
    n = scan.nextInt();
    d = scan.nextlong();
    int ans = 0;
    for (int i = 0; i < n; i++){
      long x,y;
      x = scan.nextlong();
      y = scan.nextlong();
      if (x*x+y*y <= d*d){
        ans++;
    }
  System.out.println(ans);
  }
}
