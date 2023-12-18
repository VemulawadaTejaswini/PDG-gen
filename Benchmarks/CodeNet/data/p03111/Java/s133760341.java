
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);

    int num = cin.nextInt();
    int[] target = new int[3];
    target[0] = cin.nextInt();
    target[1] = cin.nextInt();
    target[2] = cin.nextInt();

    int[] bamboo = new int[num];
    for (int i = 0; i < num; i++) {
      bamboo[i] = cin.nextInt();
    }
    System.out.println(Arrays.toString(bamboo));

    int res = findMin(target, bamboo, 0, 0, 0, 0, num);
    System.out.println(res);

  }

  //
  public static int findMin(int[] target, int[] bamboo, int bA, int bB, int bC, int use, int used) {

    if (use == used) {
      //if (Math.min(bA, Math.min(bB, bC)) > 0) {
      if (bA > 0 && bB > 0 && bC > 0) {
        return Math.abs(bA - target[0]) + Math.abs(bB - target[1]) + Math.abs(bC - target[2]) - 30;
      } else {
        return Integer.MAX_VALUE / 2;
      }
    } else {
      int res1 = findMin(target, bamboo, bA, bB, bC, use + 1, used);
      int res2 = findMin(target, bamboo, bA + bamboo[use], bB, bC, use + 1, used) + 10;
      int res3 = findMin(target, bamboo, bA, bB + bamboo[use], bC, use + 1, used) + 10;
      int res4 = findMin(target, bamboo, bA, bB, bC + bamboo[use], use + 1, used) + 10;
      return Math.min(res1, Math.min(res2, Math.min(res3, res4)));
    }

  }

}