import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int  N =sc.nextInt();
    int L =sc.nextInt();
    int s =Math.max(1-L,1);
    int t =Math.min(s,N);
    int x =0;
    for(int i=1;i<=N;i++){
      if(i==t){continue;}
      else{x=x+L-1+i;}}
    System.out.println(x);
  }
}