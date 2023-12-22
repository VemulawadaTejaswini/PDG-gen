import java.io.*;
public class Main14{
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    String[] param = input.spplit(" ");
    int time = Integer.parseInt(param[0]);
    int h = time / 60;
    int m = (time % 60) / 60;
    int s = time - 60 * h - 60 * m;
    System.out.println(h + " " + m + " " + s);
  }
}