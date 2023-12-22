import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    
    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(br.readLine());
      int[] seqS = new int[n];
      String[] line = br.readLine().split(" ");
      for (int i=0; i<n; i++)
        seqS[i] = Integer.parseInt(line[i]);

      int q = Integer.parseInt(br.readLine());
      int[] seqT = new int[q];
      line = br.readLine().split(" ");
      for(int i=0; i<q; i++)
        seqT[i] = Integer.parseInt(line[i]);
      
      int cnt=0;
      for (int ref : seqT) {
        if( isExistSeachByBinary(seqS, ref) )
          cnt++;
      }

      System.out.println(cnt);
    }
  }

  static boolean isExistSeachByBinary(int[] tar, int ref) {
    int left = 0;
    int right= tar.length;
    int mid;
    while( left < right ) {
      mid  = (left + right) / 2;
      if( tar[mid] == ref ) return true;
      else if( tar[mid] > ref ) right = mid;
      else left = mid + 1;
    }

    return false;
  }
}
