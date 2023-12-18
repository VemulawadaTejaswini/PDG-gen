import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    int M =sc.nextInt();
    Integer A[] =new Integer[N];
    long B[] =new long[N+1];
     B[0] =0;
    for(int i=0;i<N;i++){
      A[i] =sc.nextInt();
      B[i+1]=B[i]+A[i];
    }
    long C =B[N]/M/4;
    Arrays.sort(A, Collections.reverseOrder());
    if(A[M-1]<C){System.out.println("No");}
    else{System.out.println("Yes");}
  }
}