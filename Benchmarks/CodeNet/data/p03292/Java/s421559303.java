import java.util.Arrays;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] A = new Int[3];

    for(i = 1; i <= 3; i++){
      A[i] = sc.nextInt();
    }

    Arrays.sort(A);

    System.out.println(A[3] - A[1]);
  }
}
