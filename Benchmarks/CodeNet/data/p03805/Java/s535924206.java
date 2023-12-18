import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    int[] a = new int[m];
    int[] b = new int[m];
    int[] route = new int[n];

    for (int i = 0; i < m; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }

    for (int i = 0; i < n; i++) {
      route[i] = i + 1;
    }

    int cnt = 0;

    do {

      if (route[0] != 1) {
        break;
      }

      boolean acc = false;
      int i = 0;
      int j = 0;

      while (true) {

        if (((a[i] == route[j]) && (b[i] == route[j + 1])) || ((b[i] == route[j]) && (a[i] == route[j + 1]))) {
          j++;
          if (j == n - 1) {
            acc = true;
            break;
          }
          i = 0;
        } else {
          i++;
          if (i == m) {
            acc = false;
            break;
          }
        }

      }

      if (acc) {
        cnt++;
      }

    } while ((route = nextPermutation(route)) != null);

    System.out.println(cnt);

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