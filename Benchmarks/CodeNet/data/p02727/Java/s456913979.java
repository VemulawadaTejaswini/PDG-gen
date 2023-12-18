import java.io.*;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] line1 = br.readLine().split(" ");
    int x = Integer.parseInt(line1[0]);
    int y = Integer.parseInt(line1[1]);
    int a = Integer.parseInt(line1[2]);
    int b = Integer.parseInt(line1[3]);
    int c = Integer.parseInt(line1[4]);
    
    int[] p = new int[a];
    int[] q = new int[b];
    int[] r = new int[c];
    
    String[] pStr = br.readLine().split(" ");
    String[] qStr = br.readLine().split(" ");
    String[] rStr = br.readLine().split(" ");
    
    for (int i=0; i<a; i++){
      p[i] = Integer.parseInt(pStr[i]);
    }
    for (int i=0; i<b; i++){
      q[i] = Integer.parseInt(qStr[i]);
    }
    for (int i=0; i<c; i++){
      r[i] = Integer.parseInt(rStr[i]);
    }
  
    Arrays.sort(p);
    Arrays.sort(q);
    Arrays.sort(r);
    
    int[] result = new int[x+y];
    System.arraycopy(p, p.length-x, result, 0, x);
    System.arraycopy(q, q.length-y, result, x, y);
    Arrays.sort(result);
    for (int i=0; i<r.length && result[i]<r[r.length-i-1]; i++){
      result[i] = r[r.length-i-1];
    }
    long sum = 0;
    for (int i : result){
      sum += i;
    }
    System.out.println(sum);
  }
}
