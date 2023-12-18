import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long K = sc.nextLong();
    
    if(K <= A){
      A -= K;
    }else{
      A = 0;
      B -= (K - A);
      if(B < 0) B = 0;
    }
    System.out.print(A);
    Ststem.out.println(B);  
  }
}
