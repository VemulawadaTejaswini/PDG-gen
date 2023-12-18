import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());

      int[] a = new int[n];
      int[] num = new int[n+1];
      for(int i=0;i<n;i++){
        a[i] = Integer.parseInt(sc.next());
        num[a[i]]++;
      }

      Arrays.sort(num);

      int[] ans = new int[n+1];

      for(int k=1;k<=n;k++){
        int anss = 0;
        ans[0]=0;
        int[] aaa = num.clone();
        while(true){
          int cnt = 0;
          for(int j=n;j>=0;j--){
            if(aaa[j]!=0){
              aaa[j]--;
              cnt++;
            }
            if(cnt==k){anss++;break;}
            else if(j==0){ans[0]=1;break;}
          }
          if(ans[0]==1){break;}
        }
        ans[k] = anss;
      }

      for(int i=1;i<=n;i++){
        System.out.println(ans[i]);
      }

    }
}
