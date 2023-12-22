import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    long A[]=new long[N];
    long ans =0;
    for(int i=0;i<N;i++){
      A[i]=sc.nextLong();
      ans =ans+A[i];}
    Arrays.sort(A);
    ans =ans-A[0];
    System.out.println(ans);
  }
}