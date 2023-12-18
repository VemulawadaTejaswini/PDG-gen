import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    int K =sc.nextInt();
    int M[] =new int[N];
    for(int i=0;i<N;i++){
      M[i]=sc.nextInt();}
    Arrays.sort(M);
    int x=0;
    for(int j=0;j<N-K+1;j++){
      x=x+M[j];}
    System.out.println(x+K);
  }
}