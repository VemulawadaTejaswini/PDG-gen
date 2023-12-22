import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main (String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] s = new int[n];
    String[] tmpS = br.readLine().split(" ");
    for(int i = 0; i < n; i++) {
      s[i] = Integer.parseInt(tmpS[i]);
    }

    int q = Integer.parseInt(br.readLine());
    int[] t = new int[q];
    String[] tmpT = br.readLine().split(" ");
    for (int i = 0; i < q; i++) {
      t[i] = Integer.parseInt(tmpT[i]);
    }

    int count = 0;
    for(int i : t) {
      if (binarySearch(s, i)) {
        count++;
      }
    }
    System.out.println(count);
  }

  private static boolean binarySearch(int[] arr, int searchNum) {
    int mid = arr.length / 2;
    if (arr[mid] == searchNum) {
      return true;
    } else if (arr.length <= 1) {
      return false;
    } else if (arr[mid] > searchNum) {
      int[] nextArr = Arrays.copyOfRange(arr, 0, mid);
      return binarySearch(nextArr, searchNum);
    } else {
      int[] nextArr = Arrays.copyOfRange(arr, mid, arr.length);
      return binarySearch(nextArr, searchNum);
    }
  }
}