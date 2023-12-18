import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    int K =sc.nextInt();
    int x=N;int y=0;int z=0;
    for(int i=0;i<=N-K;i++){
      y=y+(N-i)*(N-K+1-i);
    y=y%1000000007}
    if(y==0){System.out.println(1);System.exit(0);}
    System.out.println(y+N-K+1);
  }
}