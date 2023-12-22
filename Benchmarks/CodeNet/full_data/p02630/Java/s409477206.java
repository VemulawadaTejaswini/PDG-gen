import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int[] a = new int[N];
    long sum=0;


    int[] numHist = new int[100001];
    Arrays.fill(numHist, 0);
    for(int i=0; i<N; i++){
      numHist[sc.nextInt()]++;
    }

    for(int i=0; i<100001; i++){
      sum += i * numHist[i];
    }

    int Q = sc.nextInt();
    int[] b = new int[Q];
    int[] c = new int[Q];

    for(int i=0; i<Q; i++){
      b[i] = sc.nextInt();
      c[i] = sc.nextInt();

      int diff = c[i] - b[i];
      sum = sum + diff * numHist[b[i]];

      numHist[c[i]] += numHist[b[i]];
      numHist[b[i]] = 0;



      System.out.println(sum);
    }

    return;
  }
}