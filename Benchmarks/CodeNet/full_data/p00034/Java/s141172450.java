import java.io.*;
import java.util.*;
class Main {
  public static void main(String... args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    while(s != null) {
      String[] arr = s.split(",");
      int[] ls = new int[10];
      int sum = 0;
      for(int i=0; i<ls.length; i++) {
        ls[i] = Integer.parseInt(arr[i]);
        sum += ls[i];
      }
      int v1 = Integer.parseInt(arr[10]);
      int v2 = Integer.parseInt(arr[11]);
      double point = (double)sum*v1/(v1+v2);
      for(int i=0; i<ls.length; i++) {
        point -= ls[i];
        if(point <= 0) {
          System.out.println(i+1);
          break;
        }
      }
      s = br.readLine();
    }
  }
}