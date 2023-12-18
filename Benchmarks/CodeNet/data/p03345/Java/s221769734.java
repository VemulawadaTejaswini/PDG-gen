// A, B, C
// B+C, C+A, A+B  (B-A)
// 2A+B+C, 2B+C+A, 2C+A+B (A-B)
// 2A+3B+3C, 2B+3C+3A, 2C+3A+3B (B-A)
// 6A+5B+5C, 6B+5C+5A, 6C+5A+5B (A-B)
// 10A+11B+11C, 10B+11C+11A, 10C+11A+11B (B-A)
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    long K = sc.nextLong();
    System.out.println(K%2 == 0 ? A-B : B-A);
  }
}