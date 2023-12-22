import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int K = sc.nextInt();
	if(K<=A){
      System.out.print(K);
    }else if(K<= A+B){
      System.out.print(K);
    }else{
      System.out.print(A-(K-A-B));
    }
  }
}