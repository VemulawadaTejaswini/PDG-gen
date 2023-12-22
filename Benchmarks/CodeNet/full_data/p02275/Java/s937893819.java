import java.util.Scanner;

class Main {
  static int[] tmpArray = new int[10001];

  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    int size = Integer.parseInt(sc.next());
    int current = 0;

    int[] inputs = new int[size];
    int[] outputs = new int[size];

    for (int i = 0; i < size; i++) {
      inputs[i] = Integer.parseInt(sc.next());
      tmpArray[inputs[i]]++;
    }

    for (int i = 1; i < size; i++) {
      tmpArray[i] += tmpArray[i - 1];
    }

    for (int i = size - 1; i >= 0; i--) {
      outputs[tmpArray[inputs[i]]-- - 1] = inputs[i];
    }

    for (int i = 0; i < size - 1; i++) {
      System.out.print(outputs[i] + " ");
    }
    System.out.println(outputs[size - 1]);
  }
}

