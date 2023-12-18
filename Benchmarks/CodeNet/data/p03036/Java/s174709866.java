import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int r = Integer.parseInt(sc.next());
      int D = Integer.parseInt(sc.next());
      int x2000 = Integer.parseInt(sc.next());

	  int[] ans = new int[11];
      
      ans[0] = x2000;
      
      for(int i=1;i<10;i++){
      	ans[i] = r*ans[i-1]-D;
       	System.out.println(ans[i]); 
      }

    }
}
