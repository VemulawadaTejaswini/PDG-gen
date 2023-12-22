import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt( br.readLine() );
      String[] line = br.readLine().split(" ");

      int[] a = new int[n];
      for (int i = 0; i < n; i++) {
        a[i] = Integer.parseInt(line[i]);
      }

      insertionSort(a, n);
    }
  }

  public static void insertionSort(int a[], int max) {
    for (int i=0,j=0,v=0; i < max; i++) {
      for( j = i-1, v = a[i]; j>=0 && a[j]>v; j-- ) {
        a[j+1] = a[j];
      }
      a[j+1] = v;
      dispIntArray(a);
    }
  }
  public static void dispIntArray(int a[]) {
    StringBuilder line = new StringBuilder(a.length*2);
    for (int i=0, max = a.length-1; i < max; i++) {
     line.append(a[i] + " ");
    }
    System.out.println( line.append(a[a.length-1]) );
  }
}
