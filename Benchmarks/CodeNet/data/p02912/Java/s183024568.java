import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());
      int m = Integer.parseInt(sc.next());

      long ans = 0;

      long[] a = new long[n];
      for(int i=0;i<n;i++){
        a[i] = sc.nextLong();
      }

      if(n==1){
          ans = a[0]/(int)(Math.pow(2,m));
      }
    else{

      for(int i=1;i<=m;i++){
        if(a[n-1]<a[n-2]){Arrays.sort(a);}
        a[n-1] = a[n-1]/2;
      }

      for(int i=0;i<n;i++){
        ans += a[i];
      }

    }

      System.out.println(ans);


    }
}
