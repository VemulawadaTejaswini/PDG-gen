import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);
  static int[] buf = new int[200000];

  public static void main(String[] args) {
//    SplittableRandom rnd = new SplittableRandom(Long.parseLong(args[0]));
//    int N = rnd.nextInt(1000) + 1;
//    int[] A = new int[N];
//    int[] B = new int[N];
//    for (int i = 0; i < N; i++) {
//      A[i] = rnd.nextInt((1<<28) - 1000) + 1000;
//      B[i] = rnd.nextInt((1<<28) - 1000) + 1000;
//    }
//    int brute = 0;
//    for (int i = 0; i < N; i++) {
//      for (int j = 0; j < N; j++) {
//        brute ^= A[i] + B[j];
//      }
//    }
//    System.err.println("brute:" + brute);

    int N = sc.nextInt();
    int[] A = new int[N];
    int[] B = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    for (int i = 0; i < N; i++) {
      B[i] = sc.nextInt();
    }

    int ans = 0;
    for (int i = 0; i < 29; i++) {
      int bb = 0;
      for (int j = 0; j < N; j++) {
        if ((B[j] & (1 << i)) != 0) ++bb;
      }
      int bbAll = bb;
      int mask = (1 << i) - 1;
      int count = 0;
      int bp = N;
      for (int j = 0; j < N; j++) {
        int av = A[j] & mask;
        while (bp > 0) {
          if ((av + (B[bp - 1] & mask)) <= mask) {
            break;
          }
          --bp;
          if ((B[bp] & (1 << i)) != 0) --bb;
        }
        if ((A[j] & (1 << i)) == 0) {
          // zero & carry or one & no carry
          count += bb;
          count += N - bp - (bbAll - bb);
        } else {
          // zero & no carry or one & carry
          count += bp - bb;
          count += bbAll - bb;
        }
      }
      if (count % 2 == 1) ans |= 1 << i;
      sort(A, i);
      sort(B, i);
    }
    System.out.println(ans);
  }

  static void sort(int[] a, int k) {
    int ap = 0;
    int bp = 0;
    int bit = 1 << k;
    for (int i = 0; i < a.length; i++) {
      if ((a[i] & bit) == 0) {
        a[ap++] = a[i];
      } else {
        buf[bp++] = a[i];
      }
    }
    for (int i = 0; i < bp; i++) {
      a[ap++] = buf[i];
    }
  }

}
