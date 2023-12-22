import java.util.Scanner;

public class Main {
  private static long counter = 0;

  private static void mergeSort(int[] array, int low, int high) {
    if (low < high) {
      int medium = (low + high) / 2;
      mergeSort(array, low, medium);
      mergeSort(array, medium + 1, high);
      merge(array, low, medium, high);
    }
  }

  private static void merge(int[] array, int low, int medium, int high) {
    int[] buffer = new int[array.length];
    for (int i = low; i < high; i++) {
      buffer[i] = array[i];
    }

    int left = low;
    int right = medium +1;
    int current = low;

    while (left <= medium && right <= high) {
      if (buffer[left] < buffer[right]) {
        array[current] = buffer[left];
        left++;
      } else {
        array[current] = buffer[right];
        right++;
      }
      current++;
      counter++;
    }
    int remaining = medium - left;
    while(remaining >= 0) {
      array[left] = buffer[left];
      left++;
      remaining--;
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String str = scan.next();

    int N = Integer.valueOf(str);

    //String input = parsed[1];
    int[] array = new int[N];
    for (int i = 0; i < N; i++) {
      array[i] = scan.nextInt();
    }   

    mergeSort(array, 0, array.length - 1); 

    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < N; i++) {
      builder.append(array[i]);
      builder.append(" ");
    }
    builder.append("\n");
    builder.append(counter);
    System.out.println(builder.toString().trim());

  }
}