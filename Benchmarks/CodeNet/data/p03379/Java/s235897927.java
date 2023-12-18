import java.util.*;

public class Main {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] box = new int[n];
      for (int i = 0; i < n; i++) {
          box[i] = sc.nextInt();
      }
      
      int[] ans = new int[n];
      for (int i = 0; i < n; i++) {
            ArrayList<Integer> midBox = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    continue;
                }
                midBox.add(box[j]);
            }
            Collections.sort(midBox);
            ans[i] = midBox.get(n/2 - 1);
      }
      
      for (int i : ans) {
          System.out.println(i);
      }
   }
}