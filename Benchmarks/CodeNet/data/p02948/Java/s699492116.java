import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());
      int m = Integer.parseInt(sc.next());

      int[] a = new int[n];
      int[] b = new int[n];

      for(int i=0;i<n;i++){
        a[i] = Integer.parseInt(sc.next());
        b[i] = Integer.parseInt(sc.next());
      }

      int ans = 0;
      int maxb = 0;
      int flag = -1;

for(int i=1;i<=m;i++){ //i=1,2,...,m
//////////////////////////////////////////////////////

for(int j=0;j<n;j++){ //check maximum Bj with Aj<=i
////////////////////////////////////////
  if(a[j]<=i && b[j]>maxb){
    maxb = b[j];
    flag = j;
  }
////////////////////////////////////////
}

ans += maxb;
if(flag!=-1){
  b[flag] = 0; //avoid reselection
}
maxb = 0;
//////////////////////////////////////////////////////
}

System.out.println(ans);

}
}
