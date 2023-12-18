import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] data = br.readLine().split(" ");
    
    long h = Integer.parseInt(data[0]);
    long w = Integer.parseInt(data[1]);
    
    long result = (w/2+w%2)*(h/2+h%2) + (w-w/2-w%2)*(h-h/2-h%2);
    if (h == 1 || w == 1){
      result = 1;
    }
    System.out.println(result);
  }
}