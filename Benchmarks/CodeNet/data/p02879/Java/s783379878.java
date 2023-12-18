import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] data = br.readLine().split(" ");
    
    int a = Integer.parseInt(data[0]);
    int b = Integer.parseInt(data[1]);
    
    if (a<10 && b<10){
      System.out.println(a*b);
    } else {
      System.out.println(-1);
    }
  }
}