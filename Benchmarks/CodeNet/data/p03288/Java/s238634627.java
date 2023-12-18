import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main
{
  public static long d[] = new long[123456];
  public static HashMap<Integer, ArrayList<Integer>> h = new HashMap<>();
  public static HashMap<Integer, ArrayList<Long>> hd = new HashMap<>();

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);

    int n = Integer.parseInt(r.readLine());

    System.out.println(n <= 1199 ? "ABC" : (n <= 2799 ? "ARC" : "AGC"));

  }

}