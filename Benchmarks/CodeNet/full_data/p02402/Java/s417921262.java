import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String[] lines = getStdin();
        int n = Integer.parseInt(lines[0]);
        String[] str = lines[1].split(" ");
        int[] a = new int[n];
            for (int i = 0; i < n; i++){
                a[i] = Integer.parseInt(str[i]);
            }
            
        Arrays.sort(a);
        //最小値はa[0] 最大値はa[n - 1]
        long sum = 0;
            for (int i = 0; i < a.length; i++){
                sum += a[i];
            }
        System.out.println(a[0] + " " + a[n - 1] + " " + sum);
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
