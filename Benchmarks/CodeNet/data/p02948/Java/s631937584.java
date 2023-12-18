import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int m = sc.nextInt();

      int[] a = new int[n];
      int[] b = new int[n];

      for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
        b[i] = sc.nextInt();
      }

      int ans = 0;

      int maxa = 0;
      int maxb = 0;
      int flag = 0;

      for(int i=0;i<m-1;i++){
        for(int j=0;j<n;j++){
          if(b[j]>maxb && a[j]>maxa){
            maxb=b[j];
            maxa=a[j];
          }
        }
        for(int j=0;j<n;j++){
          if(b[j]==maxb && a[j]==maxa){
            ans += maxb;
            b[j] = 0;
            a[j] = 0;
          }
        }
        maxa = 0;
        maxb = 0;
        for(int j=0;j<n;j++){
          if(a[j]==m-i){
            a[j] = 0;
            b[j] = 0;
          }
        }
      }


    System.out.println(ans);

    }
}
