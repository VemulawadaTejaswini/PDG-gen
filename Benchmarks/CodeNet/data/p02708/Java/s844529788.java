import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    long N =sc.nextLong();
    long K =sc.nextLong();
    long y=0;
    for(int i=0;i<=N-K+1;i++){
      y=y+(N-i)*(N-K+1-i);
    y=y%1000000007;}
    if(y==0){System.out.println(1);System.exit(0);}
    System.out.println(y+N-K+1);
  }
}
