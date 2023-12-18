import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      long n = Long.parseLong(sc.next());

      long root = (long)Math.sqrt(n)+1;
      long ans2 = 0;
      while(true){
        if(n%root==0){
          ans2 = n/root;
          break;
        }
        root--;
      }


      long ans = root + ans2 -2;
      System.out.println(ans);

    }
}
