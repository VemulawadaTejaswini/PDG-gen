import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int K = scan.nextInt();
    Integer H[] = new Integer[N];
    long count = 0;
    for (int i = 0; i < N; i++) {
      H[i] = scan.nextInt();
    }
    Arrays.sort(H, Collections.reverseOrder());
    if (K - N > 0) {
      for (int i = 0; i < N; i++) {
        H[i] = 0;
      }
    }
    else{
      for (int i = 0; i < K; i++) {
        H[i] = 0;
      }
      for (int i = K; i < N; i++) {
        count += H[i];
      }
    }
    System.out.println(count);
  }
}


