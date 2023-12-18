import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    double n=sc.nextInt();
    double ans;
    double count=0;
    for(int i=1; i<=n; i++){
      if(i%2.0==1){
        count++;
      }
    }
    ans=count/n;
    System.out.println("ans="+ans);

  }
}
