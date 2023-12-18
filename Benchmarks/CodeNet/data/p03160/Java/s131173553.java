import java.util.*;
public class Main {
    public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int size = scan.nextInt();
      String heights = scan.nextLine();
      int[] hs = heights.split(" ");
      
      scan.close();
      
      int[] res = new int[size];
      res[0] = 0;
      res[1] = Math.abs(hs[1]-hs[0]);
        
      for (int i = 2 ; i < size ; i++) {
        res[i] = Math.min(Math.abs(hs[i] - hs[i-1]),Math.abs(hs[i] - hs[i-2]));
      }
      
      return res[size];
    }
}