import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    long a=n/k;
    long ans=a*a*a;
    if((k&1)==0){
      a=(n+k/2)/k;
      ans+=a*a*a;
    }
    System.out.println(ans);
  }
}