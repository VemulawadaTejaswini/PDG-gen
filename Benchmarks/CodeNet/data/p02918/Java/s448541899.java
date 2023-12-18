import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());
      int k = Integer.parseInt(sc.next());
      String s = sc.next();

      char[] c = new char[n];

      int cntR = 0;

      int ans = 0;

      int[] bbb = new int[n];
      int cnt = 0;

      for(int i=0;i<n;i++){
        bbb[i] = 2;
      }

      for(int i=0;i<n;i++){
        c[i] = s.charAt(i);
        if(i!=0 && c[i]==c[i-1]){
          ans++;
          bbb[cnt]++;
        }
        else if(i!=0 && c[i]!=c[i-1]){
          cnt++;
        }
      }

      Arrays.sort(bbb);


      for(int i=0;i<k;i++){
        ans+=bbb[i];
      }

      System.out.print(ans);



    }
}
