import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    long L = sc.nextLong();
    long R = sc.nextLong();

    long count = 0;

    for(long y = L; y <= R; y++){
      for(long x = L ; x <= y; x++){
        long xor = y ^ x;
        long mod = y % x;

        if(xor == mod){
          // System.out.println("(" + y + " , " + x + ")" + mod);
          // System.out.println(Long.toBinaryString(y));
          // System.out.println(Long.toBinaryString(x));

          count++;
        }
      }
    }
    System.out.println(count);
  }
}
