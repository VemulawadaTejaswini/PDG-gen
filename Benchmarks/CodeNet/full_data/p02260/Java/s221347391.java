import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int count=0;
      int n = Integer.parseInt(br.readLine());
      int[] seq = new int[n];
      String[] line = br.readLine().split(" ");
      for (int i=0; i < n; i++) {
        seq[i] = Integer.parseInt(line[i]);
      }

      count = selectionSort(seq, n);

      dispIntArray(seq);
      System.out.println(count);
    }
  }

  static int selectionSort(int a[], int n) {
    int count = 0;

    for(int i=0,min,t; i<n-1; i++ ) {
      min = i;
      for(int j=i+1; j<n; j++ ) {
        if( a[min] > a[j]) min = j;
      }
      if( min != i ) {
        t = a[i]; a[i] = a[min]; a[min] = t;
        count++;
      }
    }

    return count;
  }

  public static void dispIntArray(int a[]) {
    StringBuilder s = new StringBuilder();

    for (int i : a) { s.append(i).append(" "); }
    s.setLength(s.length()-1);

    System.out.println(s);
  }
}
