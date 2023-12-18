import java.util.*;
 
public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
 
    int N=sc.nextInt();
    int T=sc.nextInt();
    int A=sc.nextInt();
    double num=110;
    int count =0;
 
    for(int i=1;i<=N;i++){
      int H = sc.nextInt();
      double diff=Math.abs(A-(T-H*0.006));
 
      if(diff < num)
      {
        num = diff;
        count = i;
      }
    }
    System.out.println(count);
  }
}