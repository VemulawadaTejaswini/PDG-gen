import java.util.Scanner;
import java.util.Arrays;

class Main {
  private static final int maxNum = 100000010;
  public static void main(String[] args) {
    Scanner cin = new Scanner(System.in);
    boolean[] primeTable = new boolean[maxNum];
    creatPrimeTable(primeTable);

    int n = cin.nextInt(), ct = 0;
    for (int i = 0; i < n; i++){
      int num = cin.nextInt();
      if (primeTable[num]) ct++;
    }

    System.out.println(ct);
  }

  private static void creatPrimeTable(boolean[] table) {
    Arrays.fill(table, true);
    double sqrt_max = Math.sqrt(maxNum);
    for (int i = 2; i < sqrt_max; i++){
      if (table[i]){
        for (int j = i * 2; j < maxNum; j += i){
          table[j] = false;
        }
      }
    }
  }
}