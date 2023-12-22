import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  static int n;
  static List<Long> a, b;
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
      a.add(Long.parseLong(in[0]));
      b.add(Long.parseLong(in[1]));
    }

    br.close();

    List<Long> sa = a.stream().sorted().collect(Collectors.toList());
    List<Long> sb = b.stream().sorted().collect(Collectors.toList());

    if(n % 2 == 0){
      ans = ((sb.get(n/2) + sb.get(n/2 - 1)) - (sa.get(n/2) + sa.get(n/2 - 1))) + 1;
    }else{
      ans = sb.get(n/2) -  sa.get(n / 2) + 1;
    }

    out.println(ans);

    out.flush();
  }
}
