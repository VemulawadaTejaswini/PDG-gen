import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n=sc.nextInt();

      int s1 = 0;
      int s2 = 0;
      int[] t = new int[n-1];

      int[] w = new int[n];
      for(int i=0;i<n;i++){
        w[i]=sc.nextInt();
      }

      for(int T=0;T<n-1;T++){
        for(int j=0;j<T+1;j++){
          s1 += w[j];
        }
        for(int j=T+1;j<n;j++){
          s2 += w[j];
        }
        t[T] = Math.abs(s1 - s2);
        s1 = 0;
        s2 = 0;
      }

      int ans = t[0];
      for(int j=1;j<n-1;j++){
        if(t[j]<ans){
          ans=t[j];
        }
      }



      System.out.println(ans);

    }
}
