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
    }else{
      int dist = B - A;
      
      if(dist >= K){
        flag = true;
      }
    }
    
    if(flag){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
    
  }
}