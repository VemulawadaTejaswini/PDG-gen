import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = (long)sc.nextInt();
    long Ans=0;
    for(int i=1;i<N;i++){
      if(N%i==0){
        Ans+=N/i-1;
      }else{
        Ans+=N/i;
      }
    }
    System.out.println(Ans);
  }
}