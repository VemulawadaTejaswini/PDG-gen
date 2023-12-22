import java.util.Scanner;

class Main {  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] numbers = new int[n];
    for (int i = 0; i < n; i++) {
      numbers[i] = in.nextInt();
    }
    trace(numbers);
    insertionSort(numbers);
  }
  
  public static void insertionSort(int[] array) {
    for (int j = 1; j < array.length; j++) {
      int key = array[j];
      for (int i = j - 1; i >= 0 && array[i] > key; i--) {
        swap(array, i, i + 1);
      }
      trace(array);
    }
  }
  
  public static void swap(int[] array, int p, int q) {
    int temp = array[p];
    array[p] = array[q];
    array[q] = temp;
  }
  
  public static void trace(int[] array) {
    StringBuilder output = new StringBuilder();
    for (int i = 0; i < array.length; i++) {
      output.append(array[i]).append(" ");
    }
    System.out.println(output.toString());
  }
}