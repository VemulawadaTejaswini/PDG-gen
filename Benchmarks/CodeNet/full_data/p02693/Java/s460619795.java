import java.util.*;
class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    
    int K = sc.nextInt(); //next(文字列), nextDouble, nextLine(1行)とか
    int A = sc.nextInt(); //next(文字列), nextDouble, nextLine(1行)とか
    int B = sc.nextInt(); //next(文字列), nextDouble, nextLine(1行)とか
    
    while(A <=B){
      if (A % K == 0){
        System.out.println("OK");
        return;
      }
      A++;
    }
    System.out.println("NG");
        
  }
}
