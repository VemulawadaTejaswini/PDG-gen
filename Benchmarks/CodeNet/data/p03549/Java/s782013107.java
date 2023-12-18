import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    //答えは、2^M*(1800M+100N)
    double answer =0;
    answer = Math.pow(2,M)*(1800*M+100*N);
    System.out.println((int)answer);
    
  }
  

  
}