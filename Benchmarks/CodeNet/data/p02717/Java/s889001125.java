import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String[] lines = getStdin();
        
        String[] str = lines[0].split(" ");
        
        String tmp = str[0];
        String tmp1 = str[1];
        String tmp2 = str[2];
        
        str[0] = str[1];
        str[1] = tmp;
        str[0] = str[2];
        str[2] = tmp1;
            for (int i = 0; i < str.length; i++){
                 System.out.print(str[i] + " ");
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