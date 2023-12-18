import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int m = Integer.parseInt(str[1]);
    int[] l = new int[m];
    int[] r = new int[m];
    int[] possibleIdCnt = new int[n];
    int cntId = 0;
    for(int i=0; i<m; i++) {
      str = in.readLine().split(" ");
      l[i] = Integer.parseInt(str[0]);
      r[i] = Integer.parseInt(str[1]);
      for(int j=l[i]; j<=r[i]; j++) {
        possibleIdCnt[j-1]++;
        if(possibleIdCnt[i]>=m)
          cntId++;
      }
    }
    
    System.out.println(cntId);
  }
}