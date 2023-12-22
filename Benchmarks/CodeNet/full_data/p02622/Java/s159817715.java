import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
 public static void main(String[] args) throws IOException {
   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
   String S = reader.readLine();
   String T = reader.readLine();
   int count = 0;
   for (int i = 0; i < S.length(); i++) {
     if (S.charAt(i) != T.charAt(i)) count += 1;
   }
   System.out.println(count);
 }
}
