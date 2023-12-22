import java.io.*;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      int count = Integer.parseInt(in.readLine());
      int[] arr = new int[count];
      int result = Math.pow(-10, 9);
      for(int i = 0; i < count; i++) {
        arr[i] = Integer.parseInt(in.readLine());
      }
      for(int i = 0; i < count-1; i++) {
        int start = arr[i];
        int end = max(Arrays.copyOfRange(arr, i+1, count));
        if(end - start > result) {
          result = end - start;
        }
      }
      System.out.println(result);

    } catch (IOException e) {
    }
  }

  public static int max(int[] arr) {
    Arrays.sort(arr);
    return arr[arr.length - 1];
  }
}