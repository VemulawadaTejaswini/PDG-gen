
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);

    int n = cin.nextInt();
    int[] rec = new int[n];

    for (int i=0;i<n;i++) {
      rec[i] = cin.nextInt();
    }

    Arrays.sort(rec);

    if (n==2) {
      System.out.println(Math.abs(rec[0]-rec[1]));
      return;
    }

    else if (n==3) {
      System.out.println(rec[1]+rec[2]-2*rec[0]);
      return;
    }

    if (n%2==0) {
      int count = n/2;
      long sum = 0;
      for (int i=0;i<count;i++) {
        if (i!=count-1) {
          sum-=rec[i]*2;
        }
        else {
          sum-=rec[i];
        }
      }
      for (int i=0;i<count;i++) {
        if (i!=count-1) {
          sum+=rec[n-i-1]*2;
        }
        else {
          sum+=rec[n-i-1];
        }
      }
      System.out.println(sum);
    }

    else {
      int count = (n-1)/2;
      long sum1=0;
      for (int i=n-1;i>count;i--) {
        sum1+=rec[i]*2;
      }
      for (int i=0;i<n-count-2;i++) {
        sum1-=rec[i]*2;
      }

      sum1-=rec[count];
      sum1-=rec[count-1];

      long sum2 = 0;
      for (int i=0;i<count;i++) {
        sum2-=rec[i]*2;
      }
      for (int i=0;i<count-1;i++) {
        sum2+=rec[n-1-i];
      }

      sum2 += rec[count];
      sum2 += rec[count+1];

      System.out.println(Math.max(sum1,sum2));
    }

  }

}