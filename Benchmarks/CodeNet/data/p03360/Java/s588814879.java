import java.util.*;
public class Main {
	public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
      int K = sc.nextInt();
      int[] array = {A,B,C};
      Arrays.sort(array);
      int ans = A+B+C;
      for (int i=0; i<K; i++) {
        ans += array[2-i];
      }
      System.out.println(ans);
    }
}