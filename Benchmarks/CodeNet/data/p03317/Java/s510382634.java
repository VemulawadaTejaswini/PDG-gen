import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s[] = (new String(in.readLine())).split(" ");
    int N = Integer.parseInt(s[0]);
    int K = Integer.parseInt(s[1]);
    int c;
    
    if(N == K){
      c = 1;
    }else if(2 * K > N){
      c = 2;
    }else if(K == 2){
      c = N - 1;
    }else{
      c = (int)((N - 2 * K)/(K - 1));
    }
    
    System.out.println(c);
  }
}
