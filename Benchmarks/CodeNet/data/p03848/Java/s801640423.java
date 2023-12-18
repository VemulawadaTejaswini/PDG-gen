import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long A[] = new long[N];
    for(int i=0;i<N;i++){
      A[i]=sc.nextLong();
    }
    Arrays.sort(A);
    long P = 1000000007L;
    boolean isOdd=(N%2==1);
    long answer =1;
    if(isOdd){//奇数人の場合
      if(A[0]!=0){
        System.out.println(0);
        return;
      }else{
        for(int i=1;i<N;i++){
          if(i%2==1){
            if(A[i]!=i+1){
              System.out.println(0);
              return;
            }else{
              continue;
            }
          }else{
            if(A[i]!=i){
              System.out.println(0);
              return;
            }else{
              answer=(answer*2)%P;
            }
          }
        }
      }
    }else{//偶数人の場合
      for(int i=0;i<N;i++){
        if(i%2==0){
          if(A[i]!=i+1){
            System.out.println(0);
            return;
          }else{
            continue;
          }
        }else{
          if(A[i]!=i){
            System.out.println(0);
            return;
          }else{
            answer=(answer*2)%P;
          }
        }
      }
    }
    System.out.println(answer);
      
              
  }
  

  
}