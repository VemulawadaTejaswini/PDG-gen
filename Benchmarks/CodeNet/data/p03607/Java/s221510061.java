import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    // Here your code !
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String N = br.readLine();

    int sum = 0;
    String key;
    HashMap<String, Boolean> hash = new HashMap<>();
    while((key = br.readLine()) != null) {
      System.out.println(hash.get(key));
	  if (hash.get(key) == null) {
        sum += 1;
        hash.put(key, true);
      } else {
        sum -= 1;
        hash.put(key, null);
      }
    }
    System.out.println(sum);
  }
}
