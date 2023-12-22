import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  static int n;
  static List<Integer> a, b;
  static long ans;

  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter out = new PrintWriter(System.out);

    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);

    a = new ArrayList<>();
    b = new ArrayList<>();

    for (int i = 0; i < n; i++) {

    in = br.readLine().split(" ");
    a.add(Integer.parseInt(in[0]));
      b.add(Integer.parseInt(in[1]));
    }

    br.close();

    List<Integer> sa = a.stream().sorted().collect(Collectors.toList());
    List<Integer> sb = b.stream().sorted().collect(Collectors.toList());

    int mim = a.get((n-1) / 2) + a.get(n / 2);
    int mam = b.get((n-1) / 2) + b.get(n / 2);

    out.println(n % 2 == 0 ? mam - mim + 1: mam / 2 - mim / 2 + 1);

    out.flush();
  }
}
