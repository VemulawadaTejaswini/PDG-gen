import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    String lcs;
   	public String lcs(String a, String b) {
        lcs = "";
        lcs(a, 0, b, 0, "");
        return lcs;
    }
    private void lcs(String a, int i, String b, int j, String soFar) {
       int n = a.length();
       int m = b.length();
       if (i >= n || j >= m) {
           if (soFar.length() > lcs.length()) {
               lcs = soFar;
           }
           return;
       }
       if (a.charAt(i) == b.charAt(j)) {
           lcs(a, i + 1, b, j + 1, soFar + a.charAt(i));
       } else {
           lcs(a, i + 1, b, j, soFar);
           lcs(a, i, b, j + 1, soFar);
       }
    }
    public static void main(String[] args)  {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String a = br.readLine();
            String b = br.readLine();
          	Main app = new Main();
            String result = app.lcs(a, b);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
