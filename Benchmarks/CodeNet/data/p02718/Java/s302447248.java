import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int M=sc.nextInt();
    int[] A=new int[N];
    int counter=0;
    int total=0;
    for(int i=0;i<N;i++){
      A[i]=sc.nextInt();
      total+=A[i];
    }
    for(int i=0;i<N;i++){
      if(A[i]>=total/(4*M)) counter++;
    }
    if(counter<M) System.out.println("No");
    else System.out.println("Yes");
  }
}