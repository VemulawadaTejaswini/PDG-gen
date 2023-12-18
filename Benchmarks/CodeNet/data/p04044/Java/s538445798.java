import java.io.*;
import java.util.*;
 
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(in.readLine());
    
    int N = Integer.parseInt(st.nextToken());
    int L = Integer.parseInt(st.nextToken());
    
    String[] s = new String[N];
    
    for (int i = 0; i < N; i++) {
        s[i] = in.readLine();
    }
    
    Arrays.sort(s);
    
    String l = "";
    
    for (int i = 0; i < N; i++) {
        l += s[i];
    }
    
    System.out.println(l);
  }
}