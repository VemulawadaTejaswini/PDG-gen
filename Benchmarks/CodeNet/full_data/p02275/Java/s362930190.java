import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

class Main {
    final static int k = 10001;
  static int[] C = new int[k];

  public static void main(String... args) {
    InputStreamReader is = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(is);

    int size = Integer.parseInt(br.readLine());
    int current = 0;
    int[] A = new int[size];
    int[] B = new int[size];

    String[] strInputs = br.readLine().split(" ", 0);

    for (int i = 0; i < size; i++) {
      A[i] = Integer.parseInt(strInputs[i]);
      C[A[i]]++;
    }

    for (int i = 1; i < k; i++) C[i] += C[i - 1];
    for (int i = size - 1; i >= 0; i--) B[--C[A[i]]] = A[i];
    System.out.println(Arrays.stream(B).boxed().map(n -> n.toString()).collect(joining(" ")));
  }
}

