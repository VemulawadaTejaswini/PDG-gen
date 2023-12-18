//ABC140 A
import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int N;
    N=sc.nextInt();
    int ans=1;
    int n=1;
    while(n<=3){
      ans=ans*N;
      n++;
    }
    System.out.println(ans);

  }
}
