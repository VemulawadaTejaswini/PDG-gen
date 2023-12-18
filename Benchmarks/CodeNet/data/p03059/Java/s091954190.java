import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str = br.readLine().split(" ");
    int sTime = Integer.parseInt(str[0]);
    int num = Integer.parseInt(str[1]);
    int eTime = Integer.parseInt(str[2]);
    
    System.out.println((eTime / sTime) * num);
  }
}