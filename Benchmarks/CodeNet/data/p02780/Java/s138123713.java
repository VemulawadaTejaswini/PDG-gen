import java.util.*;
public class Main {
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int k = sc.nextInt();
  int[] p = new int[n];
  int[] dp = new int[n];
  int max = 0;
  int wk = 0;  
  for (int i=0; i < n; i++) {
    p[i]=sc.nextInt();
    if (i<k) {
	wk = wk + p[i];
    } else{
	wk = wk + p[i] - p[i-k];

    }
    max = chmax(max,wk);
  }
  System.out.println((max+k)/2.0);
  }

  private static int chmax(int a, int b) {
    return Math.max(a,b);
  }
}






