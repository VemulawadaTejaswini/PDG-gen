import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      solve(br);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  static void solve(BufferedReader br) throws NumberFormatException, IOException {
    int cnt = Integer.parseInt(br.readLine());

    Set<String> set = new HashSet<>();
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < cnt; i++) {
      String[] input = br.readLine().split("\\s+");
      if (input[0].equals("insert")) {
        set.add(input[1]);
        continue;
      }

      if (set.contains(input[1])) {
        sb.append("yes\n");
      } else {
        sb.append("no\n");
      }
    }

    System.out.print(sb.toString());
  }
}

