import java.util.Scanner;

public class Main {

  /*
     input: 3 8 1
     output: 1 3 8
  */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] array = new int[3];
    for (int i = 0; i < 3; i++) {
      array[i] = scan.nextInt();
    }

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length-1-i; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
    System.out.printf("%d %d %d\n", array[0], array[1], array[2]);
  }
}
