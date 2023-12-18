import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] data = br.readLine().split(" ");
    int n = Integer.parseInt(data[0]);
    int a = Integer.parseInt(data[1]);
    int b = Integer.parseInt(data[2]);
    sc.close();
    int answer = n / (a + b) * a + Math.min(a, n % (a + b));
    System.out.println(answer);
  }
}
