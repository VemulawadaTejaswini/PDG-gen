import java.util.*;
public class Main{
  public static void main(String[] args){
  	Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int[] A=new int[N];
    int[] B=new int[N];
    for(int i=0;i<N;i++){
      A[i]=sc.nextInt();
      B[i]=sc.nextInt();
    }
    
    Arrays.sort(A);
    Arrays.sort(B);
    
    int min=0;
    int max=0;
    if(N%2==0){
      min=A[N/2-1]+A[N/2];
      max=B[N/2-1]+B[N/2];
    }else{
      min=A[(N-1)/2];
      max=B[(N-1)/2];
    }
      
     
    System.out.println(max-min+1);
  }
}