import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    long[] a = new long[N];
    for (int i = 0; i < N; i++) {
      a[i] = scanner.nextLong();
    }

    int l = 0;
    long sum = 0;
    long xor = 0;
    int count = 0;
    for (int r = 1; r <= N;) {
      if ((sum + a[r - 1]) == (xor ^ a[r - 1])) {
        count += r - l;
        sum += a[r - 1];
        xor ^= a[r - 1];
        r++;
        continue;
      }
      while ((sum + a[r - 1]) != (xor ^ a[r - 1])) {
        sum -= a[l];
        xor ^= a[l];
        l++;
      }
    }

    System.out.println(count);
  }
}
