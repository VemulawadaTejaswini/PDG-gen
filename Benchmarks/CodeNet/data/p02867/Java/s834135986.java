import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());

      long[] a = new long[n];
      long[] b = new long[n];
      for(int i=0;i<n;i++){
        a[i] = Long.parseLong(sc.next());
      }
      for(int i=0;i<n;i++){
        b[i] = Long.parseLong(sc.next());
      }

      Arrays.sort(a);
      Arrays.sort(b);

      String ans = "Yes";

      for(int i=0;i<n;i++){
        if(a[i]>b[i]){
          ans = "No";
          break;
        }
      }


      System.out.println(ans);

    }
}
