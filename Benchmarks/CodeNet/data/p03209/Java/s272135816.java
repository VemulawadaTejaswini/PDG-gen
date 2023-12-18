import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

  static int mod = 1000000007;

  public static void main(String[] args) throws FileNotFoundException {

   // Scanner cin = new Scanner(new FileReader("input.txt"));
   Scanner cin = new Scanner(System.in);

    int n = cin.nextInt();
    double x = cin.nextDouble();

    double[] burgur = new double[n];
    double[] patty = new double[n];
    burgur[0] = 5;
    patty[0] = 3;
    for (int i=1;i<n;i++) {
      burgur[i] = burgur[i-1]*2+3;
      patty[i] = patty[i-1]*2+1;
    }
    int pos = 0;

    double res = findRes(n, x, burgur, patty, 0);
    System.out.println((long)res);

  }

  public static double findRes(int n, double xNum, double[] burger, double[] patty, double eaten) {
    if (n==0) {
      if (xNum==0) return eaten;
      else if (xNum>0&&xNum<4) return eaten+xNum;
      else return eaten+3;
    }
    else {
      if (xNum==0) return eaten;
      else if (xNum>0&&xNum<=burger[n-1]) return eaten+findRes(n-1, xNum-1, burger, patty, eaten);
      else if (xNum == burger[n-1]+1) return eaten+patty[n-1] + 1;
      else if (xNum > burger[n-1]+1&&xNum<=2*burger[n-1]+1)
        return eaten+patty[n-1]+1+ findRes(n-1, xNum-2-burger[n-1], burger, patty, eaten);
      else return eaten + 2*patty[n-1] + 1;
    }
  }


}