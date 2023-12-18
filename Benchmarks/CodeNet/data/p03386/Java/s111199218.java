import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    int K = sc.nextInt();
    if(B-A+1<=K*2){
      for(long i=A;i<=B;i++){
        System.out.println(i);
      }
      return;
    }
    
    for(int i=0;i<K;i++){
      System.out.println(A);
      A++;
    }
    for(int i=0;i<K;i++){
      System.out.println(B-K+1);
      B++;
    }
  }
  

  
}