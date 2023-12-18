//解けなかった
import java.util.*;

public class Main{
  public static void main(String args[]) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long[] a = new int[Long.parselong(br.readLine())];
    long[] b = new int[Long.parselong(br.readLine())];
    long[] c = new int[Long.parselong(br.readLine())];
    int n = Integer.parseInt(br.readLine());
      
    for (int i = 0; i < a.length; i++) {
      a[i] = Long.parselong(br.readLine());
    }
    for (int i = 0; i < b.length; i++) {
      b[i] = Long.parselong(br.readLine());
    }
    for (int i = 0; i < c.length; i++) {
      c[i] = Long.parselong(br.readLine());
    }
       
    /*Arrays.sort(a);
    Arrays.sort(b);
    Arrays.sort(c);*/
    
    int[] sums = a.length * b.length * c.length;
    String[] str = new String[sums.length];
    for (int i = 1; i < a.length + 1; i++) {
      for (int j = 1; j < b.length + 1; j++) {
        for (int k = 1; k < c.length + 1; k++) {
            sums[i+j+k] = a[i] + b[j] + c[k];
            str = String.valueOf(sums[i+j+k]);
        }
      }
    }
    
    //Arrays.sort(sums);
    List list = Arrays.asList(str);
    Collections.reverse(list);
    String[] s = (String[])list.toArray(new String[3]);
    for (int i = 0; i < n; i++) {
      sums[i];
    }
  }
}