import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    System.out.println(c + " " + b + " "  + a);
  }
}