import java.until.Scanner;

public class 173a {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextLine();
    int x = (n+1000-1)/1000;
    int ans = x*1000 - n;
    System.out.println(ans);
  }
}
