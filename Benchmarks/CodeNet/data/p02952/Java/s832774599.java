import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 0;
    for(int i = 1;i <= n;i++){
      if(i < 10 || i >= 100 && i < 1000 || i >= 10000 && i < 100000) ans++;   
    }
    System.out.println(ans);
  }
}
