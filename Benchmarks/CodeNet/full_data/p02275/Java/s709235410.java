import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(br.readLine());
      int[] arrayS = new int[n];
      int i=0;
      int max=0;
      for (String val : br.readLine().split(" ")) {
        arrayS[i] = Integer.parseInt(val);
        if(arrayS[i] > max) max = arrayS[i];
        i++;
      }

      dispIntArray( countingSort(arrayS, max) );
    }
    catch ( IOException e ) {
      System.out.println("IOException!");
    }
  }

  public static int[] countingSort(int[] a, int k) {

    int[] reslut  = new int[a.length];
    int[] counter = new int[k+1];

    for (int var : a) {
      counter[var]++;
    }

    for (int i=1, max=k+1; i < max; i++) {
      counter[i] += counter[i-1];
    }

    for (int i=a.length-1, val=0; i>=0; i--) {
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
