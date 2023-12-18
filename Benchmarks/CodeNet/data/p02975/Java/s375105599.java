import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());

      int[] a = new int[n];

      for(int i=0;i<n;i++){
        a[i] = Integer.parseInt(sc.next());
      }

      String ans = "No";

      Arrays.sort(a);

///////////////////////////////////////////////
if(a[n-1]==0){
  ans ="Yes";
}
///////////////////////////////////////////////

///////////////////////////////////////////////
if(n%3==0 && a[n/3-1]==0 && a[n/3]==a[n-1]){
  ans ="Yes";
}
///////////////////////////////////////////////

///////////////////////////////////////////////
if(n%3==0 && a[0]==a[n/3-1] && a[n/3]==a[2*n/3-1] && a[2*n/3]==a[n-1] && a[0]!=a[n/3] && a[n/3]!=a[n-1]){
  ans ="Yes";
}
///////////////////////////////////////////////


      System.out.println(ans);

    }
}
