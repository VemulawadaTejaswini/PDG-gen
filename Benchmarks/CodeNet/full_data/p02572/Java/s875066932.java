import java.io.*;
import java.util.*;
 
public class Main{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      long N = sc.nextInt();
      long K = sc.nextInt();
      long b = K;
      long ANS = 0;
      for(int i =0;i<N-1;i++){
        long L = sc.nextInt();
        long pro = L*b;
        b += L;
        ANS += pro%1000000007;
      }
      ANS = ANS % 1000000007;
      System.out.println(ANS);
 
              
    }
}