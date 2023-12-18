import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int H=sc.nextInt();
    int W=sc.nextInt();
    int N=sc.nextInt();
    int Ans=0;
    int count=0;
    
    if(H>W){
      for(Ans=0;Ans<N;Ans+=H){
        count++;
      }
    }
    else{
      for(Ans=0;Ans<N;Ans+=W){
        count++;
      }
    }
    System.out.println(count);
  }
}