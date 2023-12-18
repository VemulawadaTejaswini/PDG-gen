import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    double res = 0;
    double sum = 0;

    int[] x = new int[n];
    int[] y = new int[n];
    int[] route = new int[n];

    for (int i = 0; i < n; i++) {
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
      route[i] = i;
    }

    do {
      for (int i = 0; i < n - 1; i++) {
        sum += Math.sqrt(Math.pow(x[route[i + 1]] - x[route[i]], 2) + Math.pow(y[route[i + 1]] - y[route[i]], 2));
      }
    } while ((route = nextPermutation(route)) != null);

    res = sum / factorial(n);

    System.out.println(res);

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

  static int factorial(int n) {
    if (n == 0) {
      return 1;
    }
    return n * factorial(n - 1);
  }

}