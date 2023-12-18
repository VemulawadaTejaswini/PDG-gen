import java.util.*;

public class B {
 public static void main(String[] args) {
  try (Scanner sc = new Scanner(System.in)) {
   int N = sc.nextInt();
   int x = sc.nextInt();
   sc.nextLine();

   int[] as = new int[N];
   for (int i = 0; i < N; i++) {
    as[i] = sc.nextInt();
   }

   int min = Integer.MAX_VALUE;
   int minI = -1;

   for (int i = 0; i < N; i++) {
    if (as[i] < min) {
     min = as[i];
     minI = i;
    }
   }

   int ans = min;
   int i = (minI + 1) % N;
   while (i != minI) {
    if (as[i] < min + x) {
     ans += as[i];
    } else {
     ans += min + x;
    }
    i = (i + 1) % N;
   }
   System.out.println(ans);
  }
 }
}