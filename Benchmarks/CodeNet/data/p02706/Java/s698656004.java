import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String[] lines = getStdin();
        String[] str = lines[0].split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        String[] a = lines[1].split(" ");
        int[] aa = new int[a.length];
        int plus = 0;
        
            for (int i = 0; i < m; i++){
                aa[i] = Integer.parseInt(a[i]);
            }
            for(int i = 0; i < m; i++){
                 plus = plus + aa[i];
            }
            if(n >= plus){
                System.out.println(n - plus);
            } else {
                System.out.println(-1);
            }
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