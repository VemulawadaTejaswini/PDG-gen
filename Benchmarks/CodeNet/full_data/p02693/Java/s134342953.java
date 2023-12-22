import java.util.Scanner;

public class Main{
  static public void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    
    boolean flag = false;
    
    if(K == 1){
      flag = true;
    }else if((A % K) == 0 || (B % K) == 0){
      flag = true;
    }else{
      int mid = (A / K) + 1;
      int midK = K * mid;
      if(A <= midK && midK <= B){
        flag = true;
      }
    }
    
    if(flag){
      System.out.println("OK");
    }else{
      System.out.println("NG");
    }
    
  }
}