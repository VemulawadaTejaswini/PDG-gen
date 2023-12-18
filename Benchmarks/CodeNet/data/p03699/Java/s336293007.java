import java.io.*;
import java.util.*;

public class Main{
  public static void main(String[] args) {
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))){
      int N = Integer.parseInt(in.readLine());
      int[] s = new int[N];
      int sum = 0;
      for(int i=0;i<N;i++){
        s[i] = Integer.parseInt(in.readLine());
        sum += s[i];
      }
      Arrays.sort(s);
      for(int i=0;i<N;i++){
        if(sum % 10 != 0)
          break;
        sum -= s[i];
      }
      System.out.println(sum);
    }catch(IOException e){
      e.printStackTrace();
    }
  }
}
