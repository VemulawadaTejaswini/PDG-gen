import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
    int ans = 0;
    for(int i = 0; i < s.length(); i++){
      if(s.charAt(i) == 'A' || s.charAt(i) == 'C' || s.charAt(i) == 'G' || s.charAt(i) == 'T'){
        int count = 1;
        for(int j = i + 1; j < s.length() - i; j++){
          if(!(s.charAt(j) == 'A' || s.charAt(j) == 'C' || s.charAt(j) == 'G' || s.charAt(j) == 'T')) break;
          count++;
        }
        ans = Math.max(ans, count);
      }
    }
    System.out.println(ans);
  }
}