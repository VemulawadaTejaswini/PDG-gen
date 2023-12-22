import java.util.Scanner;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringJoiner;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int A[] = new int[N];
    long sum = 1;
    for (int i = 0;i < N;i++) {
      A[i] = scan.nextInt();
      sum *= A[i];
    }
    System.out.println(sum);
  }
}
