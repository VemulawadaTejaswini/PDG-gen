import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(br.readLine());
      int[] arrayS = new int[n];
      int[] reslut = new int[n];
      int max=0;
      String[] line = br.readLine().split(" ");
      for (int i=0; i<n; i++ ) {
        arrayS[i] = Integer.parseInt(line[i]);
        if(arrayS[i] > max) max = arrayS[i];
      }

      reslut = countingSort(arrayS, reslut, max);
      dispIntArray( reslut );
    }
    catch ( IOException e ) {
      System.out.println("IOException!");
    }
  }

  public static int[] countingSort(int[] a, int[] reslut, int k) {

    int aLength = a.length;
    int[] counter = new int[k+1];

    for (int i=0; i<aLength; i++) {
      counter[a[i]]++;
    }

    for (int i=1, max=k+1; i < max; i++) {
      counter[i] += counter[i-1];
    }

    for (int i=aLength-1, val=0; i>=0; i--) {
      val = a[i];
      reslut[counter[val]-1] = val;
      counter[val]--;
    }

    return reslut;
  }

  public static void dispIntArray(int[] target) {
    StringBuilder s = new StringBuilder();

    for (int i : target) { s.append(i).append(" "); }
    s.setLength(s.length()-1);

    System.out.println(s);
  }
}
