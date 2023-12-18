import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String args[]) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String st = br.readLine();
    br.close();

    byte[] c = st.getBytes();
    c[0] = (byte) (c[0] + (byte) 1);

    System.out.println(new String(c));
  }
}
