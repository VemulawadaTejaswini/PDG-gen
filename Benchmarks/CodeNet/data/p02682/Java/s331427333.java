import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    int A=s.nextInt();
    int B=s.nextInt();
    int C=s.nextInt();
    int K=s.nextInt();
    int ans=0;
    int i=0;
    for(;i<A&&i<K;i++) ans++;
    for(;i<A+B&&i<K;i++) ;
    for(;i<A+B+C&&i<K;i++) ans--;
    System.out.println(ans);
  }  
}