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
    int M = scan.nextInt();
    long K = scan.nextLong();
    int i = 0;
    int j = 0;
    long A[] = new long[N];
    for (int l = 0;l < N ;l++) {
      A[l] = scan.nextLong();
    }
    long B[] = new long[M];
    for (int k = 0;k < M ;k++) {
      B[k] = scan.nextLong();
    }
    long minute = 0;
    long book = 0;
    if (A[0] > K) {
      if(B[0] > K){
        System.out.println(0);
        return;
      }
    }
    while(minute < K){
      if (i == N-1 && j == M-1) {
        book += 1;
        System.out.println(book);
        return;
      }
      else if (i == N){
        minute += B[j];
        book += 1;
        j++;
      }
      else if (j == M){
        minute += A[i];
        book += 1;
        i++;
      }
      else if (A[i] > B[j]){
        minute += B[j];
        book += 1;
        j++;
      }
      else if (B[j] > A[i]) {
        minute += A[i];
        book += 1;
        i++;
      }
    }
    if (minute > K) {
      book -= 1;
    }
    System.out.println(book);
  }
}