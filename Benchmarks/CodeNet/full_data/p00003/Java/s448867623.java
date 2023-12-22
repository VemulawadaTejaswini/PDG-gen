import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    int numCases = Integer.parseInt(buffer.readLine());
    String[] line;
    int[] lineInt;
    int A, B, C;

    for(int i = 0;i < numCases;i++){
      line = buffer.readLine().split();
      A = Integer.parseInt(line[0]);
      B = Integer.parseInt(line[1]);
      C = Integer.parseInt(line[2]);

      if( ((A * A) + (B * B)) ==  (C * C))
        System.out.println("YES");
      else
        System.out.println("NO");
    }
  }
}