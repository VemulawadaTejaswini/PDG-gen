import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int D = scanner.nextInt();
    int X = scanner.nextInt();
    int[] A = new int[110];
    for (int i = 0; i < N; i++){
      A[i] = scanner.nextInt();
    }
    int count = N + X;

    for (int i = 0; i < N; i++){
      for (int j = 1; j <= D; j++){
        if (j * A[i] + 1 <= D){
          count++;}
      }
    }
    System.out.println(count);
  }
}
