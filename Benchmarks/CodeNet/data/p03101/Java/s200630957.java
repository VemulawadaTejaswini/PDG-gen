import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
      Scanner sc=new Scanner(System.in);
      String[] x = sc.nextLine().split(" ");
      String[] y = sc.nextLine().split(" ");
      
      Integer r   = (Integer.parseInt(x[0]) -Integer.parseInt(y[0]));
      Integer c   = (Integer.parseInt(x[1]) -Integer.parseInt(y[1]));
      Integer ans = r*c;
      
      System.out.println(ans);

    }
}
