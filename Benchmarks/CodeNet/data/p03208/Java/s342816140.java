import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i;
    int N = sc.nextInt();
    int K = sc.nextInt();
    Integer h[] = new Integer[N];
    for (i = 0; i < N; i++) {
    	h[i] = sc.nextInt();
    }
    Arrays.sort(h, Comparator.naturalOrder());
    int size = N - (K-1);
    int ans = 100000;

    for (i = 0; i < size; i++) {
    	int max = 0;
    	int min = 100000;
    	for (int j = 0; j < K; j++) {
    		if (h[i+j] > max) max = h[i+j];
    		if (h[i+j] < min) min = h[i+j];
    	}
    	int sa = max - min;
    	if (sa < ans) ans = sa;
    }
    System.out.println(ans);

  }
}