import java.io.*;

public class Main {
  public static void main(String[] args) {
    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      int count = Integer.parseInt(in.readLine());
      int[] arr = new Array[count];
      int result = 0;
      for(int i = 0; i < count; i++) {
        arr[i] = Integer.parseInt(in.readLine());
      }
      for(int i = 0; i < count; i++) {
        int start = arr[i];
        int end = max(Array.copyOfRange(arr, i+1, count-1));
        if(end - start > result) {
          result = end - start;
        }
      }
      System.out.println(result);
      
    } catch (IOException) {
    }
  }

  public int max(int[] arr) {
    Array.sort(arr);
    return arr[arr.length() - 1];
  }
}