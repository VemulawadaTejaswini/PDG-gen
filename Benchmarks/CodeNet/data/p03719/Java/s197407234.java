import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] data = br.readLine().split(" ");
    int a = Integer.parseInt(data[0]);
    int b = Integer.parseInt(data[1]);
    int c = Integer.parseInt(data[2]);
    
    if (c >= a && c<= b){
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}