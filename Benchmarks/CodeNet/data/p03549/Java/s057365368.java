import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] data = br.readLine().split(" ");
    int n = Integer.parseInt(data[0]);
    int m = Integer.parseInt(data[1]);
    
    int time = 1900*m + 100*(n-m);
    int result = (time*(int)Math.pow(2, m));
    System.out.println(result);
  }
}
