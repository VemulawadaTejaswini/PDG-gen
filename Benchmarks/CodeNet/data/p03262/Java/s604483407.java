
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner (System.in);

    int times = cin.nextInt();
    int start = cin.nextInt();
    int[] pos = new int[times];
    for (int i=0;i<times;i++){
      pos[i] = Math.abs(start - cin.nextInt());
    }


      System.out.println(getMoreBigDiv(pos, times));


  }


  public static int getBigDiv(int a, int b) {// 求两个数的最大公约数
    if (b == 0)
      return a;
    return getBigDiv(b, a % b);

  }

  public static int getMoreBigDiv(int num[], int n) { // 求多个数的最大公约数
    if (n == 1)
      return num[n - 1];
    return getBigDiv(num[n - 1], getMoreBigDiv(num, n - 1));
  }


}