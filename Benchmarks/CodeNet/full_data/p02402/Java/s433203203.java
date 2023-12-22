import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] sq = new int[n];
    for (int i = 0; i < n; i++) {
    	sq[i] = sc.nextInt();
    }
    int min = 0, max = 0;
    long sum = 0;
    for (int i = 0; i < sq.length; i++) {
    	if (i == 0) { min = sq[i]; max = sq[i]; }
    	if (sq[i] < min) { min = sq[i]; }
    	if (sq[i] > max) { max = sq[i]; }
    	sum += sq[i];
    }
    System.out.printf("%d %d %d\n", min, max, sum);
  }
}
