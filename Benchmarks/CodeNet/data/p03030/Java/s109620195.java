import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
  public static void main(String[] args) {
    new Main().run();
  }

  private void run() {
    try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out)) {

        int n = Integer.parseInt(in.readLine());

        String[] lines;
        ArrayList<String[]> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
          lines = in.readLine().split(" ");
          list.add(new String[] {lines[0], lines[1], String.valueOf(i+1)});
        }

        list.sort(new Comparator<String[]>() {
          @Override
          public int compare(String[] sa, String[] sb) {
            if(sa[0].equals(sb[0]))
              return sa[1].compareTo(sb[1]) * -1;
            else
              return sa[0].compareTo(sb[0]);
          } 
        });

        list.forEach(s -> out.println(s[2]));
        out.flush();
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }
}