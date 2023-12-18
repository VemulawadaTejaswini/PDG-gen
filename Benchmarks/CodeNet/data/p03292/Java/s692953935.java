import java.util.Arrays;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] A = new int[3];

    for(int i = 1; i < 4; i++){
      A[i] = sc.nextInt();
    }

    Arrays.sort(A);

    int ans = (A[2] - A[1]) - (A[3] - A[2]);
    System.out.println(ans);
  }
}
