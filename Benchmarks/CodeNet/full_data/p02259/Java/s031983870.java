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
      for (int i=0; i < n; i++)
        seq[i] = Integer.parseInt(line[i]);

      count = bubbleSort(seq, n);

      dispIntArray(seq);
      System.out.println(count);
    }
  }

  static int bubbleSort(int[] a, int n) {
    int count=0;

    for(int i=0,f=1,t; i<n || f==1; i++ ) {
      f=0;
      for(int j=n-1; j>0; j-- ) {
        if( a[j] < a[j-1]) {
          t = a[j];
          a[j] = a[j-1];
          a[j-1] = t;
          count++;
          f=1;
        }
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
