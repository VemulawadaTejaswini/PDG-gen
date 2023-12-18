import java.util.Scanner;


public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = a;
    int ans = 1;
    while(sum<b){
      ans++;
      sum+=a-1;
    }
    if(b==1)ans=0;
    System.out.print(ans);
  }
}
