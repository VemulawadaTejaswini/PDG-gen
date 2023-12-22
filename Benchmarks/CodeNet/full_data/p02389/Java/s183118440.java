import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] lines = getStdin();
        String str = lines[0];
        String[] str1 = str.split(" ");
        int ver = Integer.parseInt(str1[0]);
        int par = Integer.parseInt(str1[1]);
        int area;
        int surr;

        area = ver * par;
        surr = (2 * ver) + (2 * par);

        System.out.println(area + " " + surr);
    }
  
  private static String[] getStdin() {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> lines = new ArrayList<>();
    while (scanner.hasNext()) {
      lines.add(scanner.nextLine());
    }
    return lines.toArray(new String[lines.size()]);
  }
  
}

