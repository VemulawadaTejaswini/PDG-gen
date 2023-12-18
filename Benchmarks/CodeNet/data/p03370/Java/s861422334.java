import java.util.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int[] m = new int[n];
    int minM = Integer.MAX_VALUE;
    int answer = n;

    for (int i = 0; i < n; i++) {
      m[i] = sc.nextInt();
      x -= m[i];
      if (m[i] < minM) {
        minM = m[i];
      }
    }

    answer += (x / minM);

    System.out.println(answer);
  }
}
