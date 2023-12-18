import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] strs = br.readLine().split(" ");
    int A = Integer.parseInt(strs[0]);
    int B = Integer.parseInt(strs[1]);
    String ans = ":(";
    
    if (A <= 8 && B <= 8) {
      ans = "Yey!";
  	} else if (A <= 10) {
      if (B <= 6) {
        ans = "Yey!";
      }
    } else if (B <= 10) {
      if (A <= 6) {
        ans = "Yey!";
      }
    }
    System.out.print(ans);
  }
}