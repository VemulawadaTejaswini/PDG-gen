
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);

    int n = cin.nextInt();
    int[] A = new int[n];
    int[] B = new int[n];

    for (int i=0;i<n;i++) {
      A[i] = cin.nextInt();
    }
    for (int i=0;i<n;i++) {
      B[i] = cin.nextInt();
    }
    //System.out.println(Arrays.toString(A));
    //System.out.println(Arrays.toString(B));
    long sumA = 0;
    long sumB = 0;

    for (int i : A)
      sumA += i;
    for (int i : B)
      sumB += i;

    if (sumA<sumB) {
      System.out.println(-1);
      return;
    }
    int mark = 0;
    int[] diff = new int[n];
    for (int i=0;i<n;i++) {
      if (A[i]<B[i]) {
        mark = 1;

      }
      diff[i] = A[i] - B[i];
    }

    if (mark == 0) {
      System.out.println(0);
      return;
    }
    else {

      Arrays.sort(diff);
      //System.out.println(Arrays.toString(diff));
      int zero = 0;
      int nega = 0;
      long negaSum = 0;
      int posi = 0;
      long posiSum = 0;
      for (int i=0;i<diff.length;i++) {
        if (diff[i]==0) zero++;
        else if (diff[i]>=0) {
          posi++;
          posiSum+=diff[i];
        }
        else {
          nega++;
          negaSum+=diff[i];
        }
      }
      if (nega>=posi) {
        System.out.println(nega+posi);
      }
      else {
        long totalDidff = negaSum+posiSum;
        int count = 0;
        for (int i=0;i<diff.length;i++) {
          if (diff[i]>0) {
            totalDidff-=diff[i];
            count++;
          }
          if (totalDidff<=0) break;
        }
        System.out.println(nega+zero+count);
      }

    }

  }

}