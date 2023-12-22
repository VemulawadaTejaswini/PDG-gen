import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int K = sc.nextInt();
    if(A>0 && C==0){
      System.out.print(A);
    }else if(A>0 && C>0){
      if(A-C > 0){
        System.out.print(A-C);
      }else{
        System.out.print(0);
      }
    }else{
      System.out.print(0);
    }
  }
}