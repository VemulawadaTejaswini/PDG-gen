import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long ans=0;
    int x=(int)Math.sqrt(n);
    for(int i=1;i<x;i++){
      ans++;
      int ab=i*(i+1);
      for(;ab<n;ab+=i){
        ans+=2;
      }
    }
    System.out.println(ans);
  }
}