import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws Exception{
    try (Scanner sc = new Scanner(System.in)){
      int T = sc.nextInt();
      out : for (int i = 0; i < T; i++) {
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();
        HashSet<Long> hashset = new HashSet<Long>();
        Long stock = A;
        while(!hashset.contains(stock)) {
          hashset.add(stock);
          if (stock < B) {
            System.out.println("No");
            continue out;
          } else {
            stock -= (long)(B * Math.floor(stock / B));
          }
          if (stock <= C) {
            stock += D;
          }
        }
        System.out.println("Yes");
      }
    }
  }
}
