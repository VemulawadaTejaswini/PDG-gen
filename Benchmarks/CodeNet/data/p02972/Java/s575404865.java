import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    int[] A = new int[N+1];
    A[0]=1;
    int anshin=0;
    int count=0;
    for(int i=1;i<=N;i++){
      A[i] = sc.nextInt();
      if(A[i]==1) {
        anshin=1;
        count++;
      }
    }
    
    
    
    int sum;
    int tmp;
    for(int j=1;j<=N;j++){
      tmp=1;
      sum=0;
      while(j*tmp<=N){
        sum= sum+ A[j*tmp];
        tmp++;
      }
      if(sum%2 != A[j]) {
        System.out.println(-1);
      }
    }
    
    System.out.println(count);
    if(anshin==0) {
      return;
    }
    for(int k=1;k<=N;k++){
      if(A[k]==1){
          System.out.println(k);
      }
    }

  }
}