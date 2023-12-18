import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    long[] a = new long[N];
    for (int i = 0; i < N; i++) {
      a[i] = scanner.nextLong();
    }

    int count = 0;

    for(int l = 0; l < N; l++){
      long sum = a[l];
      long xor = a[l];
      count++;

      for (int r = l + 1; r < N; r++) {
        sum += a[r];
        xor ^= a[r];
        if (sum == xor) {
          count++;
        } else {
          break;
        }
      }
    }

    System.out.println(count);
  }
}
