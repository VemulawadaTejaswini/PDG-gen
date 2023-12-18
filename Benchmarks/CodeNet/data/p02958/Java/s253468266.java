import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = input.nextInt();
    }

    int count = 0;
    for (int i = 0; i < n - 1; i++) {
      if(array[i] != i + 1)
        count++;
    }
    if (count <= 2)
      System.out.println("YES");
    else
      System.out.println("NO");
  }
}
