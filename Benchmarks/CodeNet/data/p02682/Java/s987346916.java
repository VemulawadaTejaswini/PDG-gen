import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] lines = getStdin();
        String str = lines[0];
        String[] str1 = str.split(" ");
        int A = Integer.parseInt(str1[0]); //1
        int B = Integer.parseInt(str1[1]); //0
        int C = Integer.parseInt(str1[2]); //-1
        int K = Integer.parseInt(str1[3]); //枚数（*)
        
        int max = 1;
        for (int i = 0; i <= K - 1; i++){
            if (A >= 0){
                A -= 1;
                max++;
            } if (B >= 0){
                B -= 1;
            } if (C >= 0){
                C -= 1;
                max--;
            }
        }
        
        System.out.println(max);
        
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
