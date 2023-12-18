import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int[] p = new int[n];
    int[] q = new int[n];
    int[] route = new int[n];

    for (int i = 0; i < n; i++) {
      p[i] = sc.nextInt();
      route[i] = i + 1;
    }

    for (int i = 0; i < n; i++) {
      q[i] = sc.nextInt();
    }

    boolean pok = false;
    boolean qok = false;
    int cnt = 0;
    int porder = 0;
    int qorder = 0;

    do {
      cnt++;
      if (Arrays.equals(p, route)) {
        pok = true;
        porder = cnt;
      }

      if (Arrays.equals(q, route)) {
        qok = true;
        qorder = cnt;
      }

      if (pok && qok) {
        break;
      }
    } while ((route = nextPermutation(route)) != null);

    System.out.println(Math.abs(porder - qorder));

  }

  static int[] nextPermutation(int[] array) {
    int i = Integer.MAX_VALUE;
    int j = 0;
    int[] returnarray = new int[array.length];

    for (int l = array.length - 2; l >= 0; l--) {
      if (array[l] < array[l + 1]) {
        i = l;
        break;
      }
    }

    if (i == Integer.MAX_VALUE) {
      return null;
    }

    for (int l = array.length - 1; l >= 0; l--) {
      if (array[i] < array[l]) {
        j = l;
        break;
      }
    }

    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
    i++;

    for (int l = 0; l < i; l++) {
      returnarray[l] = array[l];
    }
    for (int l = 0; l < array.length - i; l++) {
      returnarray[l + i] = array[array.length - l - 1];
    }

    return returnarray;

  }

}