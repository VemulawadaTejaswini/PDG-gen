import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());

      int[] v = new int[n];
      for(int i=0;i<n;i++){
        v[i] = Integer.parseInt(sc.next());
      }
      int[] c = new int[n];
      for(int i=0;i<n;i++){
        c[i] = Integer.parseInt(sc.next());
      }

      int ans = 0;

      int[] vc = new int[n];
      for(int i=0;i<n;i++){
        vc[i] = v[i] - c[i];
        if(vc[i]>0){
          ans+=vc[i];
        }
      }

      System.out.println(ans);

    }
}
