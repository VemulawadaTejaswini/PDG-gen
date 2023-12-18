import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] array = new int[N];
    for (int i = 1; i <= N; i++)
      array[sc.nextInt() - 1] = i;
    System.out.println(String.join(" ", Arrays.stream(array).mapToObj(String::valueOf).toArray(String[]::new)));
  }
}