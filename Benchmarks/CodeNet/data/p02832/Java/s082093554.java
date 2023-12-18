import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int a[] = new int[N];
    int answer = 0;
    int tmpNumber=1;
    boolean isMinusOne = true;
    for(int i=0;i<N;i++){
      a[i]=sc.nextInt();
      if(a[i]==1){
        isMinusOne=false;
      }
    }
    if(isMinusOne){
      System.out.println(-1);
      return;
    }
    
    
    for(int i=0;i<N;i++){
      if(a[i]!=tmpNumber){
        answer=answer+1;
      }else{
        tmpNumber=tmpNumber+1;
      }
    }
    System.out.println(answer);
        
    
  }
  

  
}