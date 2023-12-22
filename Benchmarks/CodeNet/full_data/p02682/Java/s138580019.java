import java.util.*;

class Main{
  public void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int K = sc.nextInt();
    
    if ( A >= K )
      System.out.println(A);
    else if( B >= (K-A) )
      System.out.println(A);
    else
      System.out.println(A*1+0*B-(K-A-B)*1);
  }
}