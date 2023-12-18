import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String s = br.readLine();
    int max = 0;
    
    for(int i = 1; i < n; i++) {
      String b = s.substring(i);
      int value = s.substring(0, i).chars().distinct().map(x -> {
        if(b.indexOf(x) != -1) {
          return 1;
        }
        else {
          return 0;
        }
      }).sum();
      
      max = Math.max(max, value);
    }
    
    System.out.println(max);
  }
}
