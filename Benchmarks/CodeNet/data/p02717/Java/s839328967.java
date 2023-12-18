import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] lines = getStdin();
        String str = lines[0];
        String[] num = str.split(" ");
        
        String tmp = num[0];
        String tmp1 = num[1];
        String tmp2 = num[2];
        num[0] = num[1];
        num[1] = tmp;
        num[0] = num[2];
        num[2] = tmp1;

        for (int i = 0; i < num.length; i++){
            System.out.print(num[i] + " ");
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
