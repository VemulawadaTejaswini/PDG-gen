import java.io.*;
import java.util.Scanner;

public class Main{
  public static void main(String[] args) throws IOException{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String ans = "zzzzzzz";
    for (int i = 0 ; i < n ; i++){
      String in = br.readLine();
      if (in.compareTo(ans) < 0)
        ans = in;
    }
    System.out.println(ans);
  }
}