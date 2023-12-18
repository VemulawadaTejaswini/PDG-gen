import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    int N = in.nextInt();
    int K = in.nextInt();
    
    long[] nums = new long[N];
    for (int i = 0; i < N; i++) {
      nums[i] = in.nextLong();
    }
    
    List<Long> prod = new ArrayList();
    for (int i = 0; i < N; i++) {
      for (int j = i+1; j < N; j++) {
        prod.add(nums[i] * nums[j]);
      }
    }

    Collections.sort(prod);
    System.out.println(prod.get(K-1));
  }
}