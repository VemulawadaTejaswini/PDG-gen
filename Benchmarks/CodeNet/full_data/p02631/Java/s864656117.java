import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    int n=0;
    long a[] =new long[N];
    a[0]=sc.nextLong();
    long M=a[0];
    for(int i=1;i<N;i++){
      a[i]=sc.nextLong();
      M = M^a[i];}
    long ans ;
    for(int j=0;j<N;j++){
      ans =M^a[j];
      System.out.println(ans);
    }
  }
}