import java.util.Scanner;

public class Main {
  public static void swap(int[] array, int x, int y) {
    int temp = array[x];
    array[x] = array[y];
    array[y] = temp;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    sc.useDelimiter("[\\s,]");

    int w = sc.nextInt();
    int n = sc.nextInt();

    int[] order = new int[w];
    for(int i = 0; i < w; i++) {
      order[i] = i + 1;
    }

    for(int i = 0; i < n; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      swap(order, a - 1, b - 1);
    }

    for(int i = 0; i < w; i++) {
      System.out.println(order[i]);
    }
  }
}