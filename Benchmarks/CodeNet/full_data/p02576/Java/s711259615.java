import java.util.*;
public class Main{
  public static void main(String args[]){
  	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int x=sc.nextInt();
    int t=sc.nextInt();
    int ans=t;
    n-=x;
    while(n>0){
      n-=x;
      ans+=t;
    }
    System.out.println(ans);
  }
}