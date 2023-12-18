import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int x = Integer.parseInt(in.readLine());
    boolean judge = true;
    
    while(judge) {
      if(judgeNum(x)) {
        judge = false;
        System.out.println(x);
      }
      x++;
    }
  }
  
  private static boolean judgeNum(int x) {
    for(int i=2; i<x/2; i++) {
      if(x%i==0)
        return false;
    }
    return true;
  }
}