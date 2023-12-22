import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] lines = getStdin();
        String str1 = lines[0];
        int mult = Integer.parseInt(str1); //K
        
        String str2 = lines[1];
        String[] str21 = str2.split(" ");
        int from = Integer.parseInt(str21[0]); //A
        int till = Integer.parseInt(str21[1]); //B

        for (int i = 1; i <= 1000 ; i++){
            int multiple = mult * i ;
            //System.out.println(multiple);
            if (multiple >= from && multiple <= till){
                System.out.println("OK");
                return;
            } else {
                multiple = mult; //=7
            }
        }

        System.out.println("NG");


   
    
    
        
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
