import java.io.*;
import java.util.*;


public class Main{
  public static void main(String[] args) throws IOException {
      BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

      for(;;){
        String line = buf.readLine();
        int int_line = Integer.parseInt(line);
        if(int_line == 0){
          break;
        }
        int[] a = new int[line.length()];
        for(int i=(line.length()-1); i>=0; i--){
          int x = int_line%10;
          a[i]=x;
          int_line=int_line/10;
        }

        int sum = 0;
        for(int i=0; i<a.length; i++){
          sum += a[i];
        }
      System.out.println(sum);
    }
  }
}