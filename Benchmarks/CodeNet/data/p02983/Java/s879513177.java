import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int L=sc.nextInt();
      int R=sc.nextInt();

      L = L % 2019;
      R = R % 2019;

      //0 < L <= i < j <= R

      int mod,ii,jj;
      int ans = 2019;

      for(int i=L;i<R;i++){
        for(int j=i+1;j<=R;j++){
          mod = (i*j) % 2019;
          ans = Math.min(ans,mod);
        }
      }

      System.out.println(ans);

    }
}
