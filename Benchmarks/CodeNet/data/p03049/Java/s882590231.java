import java.io.*;

public class Main{
  public static void main(String... args) throws IOException {
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String line = stdin.readLine();
    String[] in = line.split(" ");
    int n = Integer.parseInt(in[0]);
    System.err.println(n);
    int beginB = 0;
    int endA = 0;
    int naka = 0;
    boolean sep = false;
	for (int i=0; i<n; i++) {
	  line = stdin.readLine();
      boolean begin = line.charAt(0) == 'B';
      if (begin) {
        beginB++;
      }
      boolean end = line.charAt(line.length() - 1) == 'A';
      if (end) {
        endA++;
      }
      if ((begin ^ end) && !sep) {
        sep = true;
      }
      naka += line.split("AB").length - 1;
    }
    System.err.println(beginB);
    System.err.println(endA);
    System.err.println(naka);
    System.err.println(sep);
	
    int ret;
    if (sep) {
      ret = naka + Math.min(beginB, endA);
    } else {
      ret = naka + beginB - 1;
    }
    System.out.println(ret);
  }
}