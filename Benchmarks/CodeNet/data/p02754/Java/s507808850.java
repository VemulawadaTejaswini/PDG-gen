import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long A = sc.nextLong();
    long B = sc.nextLong();
    
    if(N%(A+B)>=A){
      System.out.print((N/(A+B))*A + A);
    }else{
      System.out.print((N/(A+B))*A + N%(A+B));
    }
  }
}