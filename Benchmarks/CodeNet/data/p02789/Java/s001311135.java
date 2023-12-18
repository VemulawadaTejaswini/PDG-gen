import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str_array = in.readLine().split(" ");
    int n = Integer.parseInt(str_array[0]);
    int m = Integer.parseInt(str_array[1]);
    System.out.println(n==m?"Yes":"No");
  }
}