import java.util.*;

public class Main {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      int h = sc.nextInt();
      int n = sc.nextInt();
      
      int[] x = new int[n];
      
      int sum = 0;
      
      for(int i = 0; i < n; i++) {
		x[i] = sc.nextInt();
        
        sum = sum + x[i];
      }
      
      
      
      if(h < sum) {
      
        System.out.println("YES");
      } else {
      
        System.out.println("NO");
      }
    }
}
