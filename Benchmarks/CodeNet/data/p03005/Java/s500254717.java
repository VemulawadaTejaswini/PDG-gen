import java.util.Scanner;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int k = sc.nextInt();
    int r = 0;
    
    if(1<=k && k<=n && n<=100){
      r = (n%k);
      System.out.println(r);
    }
  }
}