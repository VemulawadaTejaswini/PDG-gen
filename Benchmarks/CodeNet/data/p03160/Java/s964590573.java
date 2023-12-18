import java.util.*;
public class Main {
  public static void main(String[] args) {
  	Scanner sc = new Scanner(System.in);
    // get a integer
    int N = sc.nextInt();
    int[] input = new int[N];
    for(int i=0; i<N ; i++){
      input[i] = sc.nextInt();
    }
    System.out.println(minCost(N, input));
  }
  
  public static int minCost(int N, int[] array) {
    if (N < 2) {
      return 0;
    }
    if (N == 2) {
      return Math.abs(array[0] - array[1]);
    }
    int pre = Math.abs(array[N-1] - array[N-2]);
    int prepre = Math.abs(array[N-1] - array[N-3]);
    if (pre > prepre) {
      return minCost(N-2, Arrays.copyOfRange(array, 0, N-2)) + prepre;
  	} else {
      return minCost(N-1, Arrays.copyOfRange(array, 0, N-1)) + pre;
    }
  }
}