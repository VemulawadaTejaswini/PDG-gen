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
    int sum = 0;
    Integer[] p = new Integer[N];
    for (int i = 0; i < N; i++) {
      p[i] = scan.nextInt();
    }
    Arrays.sort(p);
    for (int i = 0; i < K; i++) {
      sum += p[i];
    }
    System.out.println(sum);
  }
}

