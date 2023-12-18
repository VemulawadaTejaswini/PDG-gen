import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt(); // 1
    int B = sc.nextInt(); // 0
    int C = sc.nextInt(); // -1
    int K = sc.nextInt(); // total

    int sum = 0;

    if(A<K){
      K = K -A;
      sum +=A;
    }else{
      System.out.println(A);
      return;  
    }
    if(B<=K){
      K = K - B;
    }else{
      System.out.println(A);
      return;  
    }
    System.out.println(sum-K);  
  }
}



