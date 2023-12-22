import java.util.*;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int nLine = Integer.parseInt(sc.nextLine());
      ArrayList<String> arr = new ArrayList<>();
      
      for(int i = 0; i < nLine; i ++) {
         String[] input = sc.nextLine().split(" ");
         String command = input[0];
         String str = input[1];
         
         if(command.equals("insert")) {
            arr.add(str);
         }
         
         if(command.equals("find")) {
            String ans = find(arr, str) ? "yes" : "no";
            System.out.println(ans);
         }
         
      }      
      
      
   }//main method
   
   public static boolean find(ArrayList<String> arr, String str) {
      for(int i = 0; i < arr.size(); i ++) {
         if(arr.get(i).equals(str)) {
            return true;
         }
      }
      
      return false;
   }
   
      
}
