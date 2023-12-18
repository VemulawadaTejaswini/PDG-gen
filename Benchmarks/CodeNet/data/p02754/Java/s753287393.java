import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] data = br.readLine().split(" ");
    br.close();
    int n = Integer.parseInt(data[0]);
    int a = Integer.parseInt(data[1]);
    int b = Integer.parseInt(data[2]);
    int answer = n / (a + b) * a;
    answer += Math.min(a, n % (a + b));
    System.out.println(answer);
  }
}