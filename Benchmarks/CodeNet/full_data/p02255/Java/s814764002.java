import java.io.*;

public class Main {
  public static void main(String[] args) {
    try {
      BufferedReader in = new BufferedReader( new InputStreamReader(System.in));
      String count = new String(in.readLine());
      int nCount = Integer.parseInt(count);
      String s = new String(in.readLine());
      System.out.println(s);
      String[] arr = s.split(" ");
      for( int i = 1; i < nCount; i++ ) {
        String v = arr[i];
        int j = i - 1;
        while(j >= 0 && Integer.parseInt(arr[j]) > Integer.parseInt(v)) {
          arr[j+1] = arr[j];
          j--;
          arr[j+1] = v;
        }
        StringBuilder sb = new StringBuilder();
        for( String w : arr ) {
          sb.append(w).append(" ");
        }
        System.out.println(sb.toString().trim());
      }
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}