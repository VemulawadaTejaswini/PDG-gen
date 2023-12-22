import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] lines = getStdin();
        String str = lines[0];
        double num = Double.parseDouble(str);
        double area;
        double lap;
        
        area = num *  num * Math.PI;
        lap = num * 2.0 * Math.PI;
        
        String s = String.format("%.6f",area);
        String t = String.format("%.6f",lap);
        System.out.println(s + " " + t);


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

