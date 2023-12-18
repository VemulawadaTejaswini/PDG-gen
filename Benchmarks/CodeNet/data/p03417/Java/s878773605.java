import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long M = sc.nextLong();
    long n, m;
    if(N >= 2){
      n = N-2;
    }else{
      n = 1;
    }
    
    if(M >= 2){
      m = M-2;
    }else{
      m = 1;
    }

    System.out.println(n * m);
  }
}