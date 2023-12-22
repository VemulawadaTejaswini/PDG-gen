import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String[] lines = getStdin();
        long x = Long.parseLong(lines[0]);
        long sum = 100;
        int year = 0;
            while(sum < x){
                sum = sum + (sum*1/100);
                year++;
            }
        System.out.println(year);
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