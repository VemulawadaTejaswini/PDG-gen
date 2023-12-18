import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    long ans = 0;
    for (int i = 1; i <= n; i++){
      if (i%3==0 || i%5 == 0){
        continue;
      }else{
        ans = ans + i;
      }
    }
    System.out.println(ans);
  }
}
