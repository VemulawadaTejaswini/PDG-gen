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

      int maxbefore = 0;
      int maxb = 0;
      int flag = -1;

for(int i=1;i<=m;i++){ //i=1,2,...,m
//////////////////////////////////////////////////////
for(int j=0;j<n;j++){ //check maximum Bj with Aj<=i
  if(a[j]<=i){
  //////////////////////////////////////////////////
    maxbefore = maxb;
    maxb = Math.max(maxb,b[j]);
    //System.out.println("when i="+i+",when j="+j+",maxb="+maxb+",b["+j+"]="+b[j]);
    if(maxbefore!=maxb){ // if maxb is renewed
      flag = j;
    }
  //////////////////////////////////////////////////
  }
}
ans += maxb;
if(flag!=-1){
  b[flag] = 0; //avoid reselection
}
maxbefore = 0;
maxb = 0;
//System.out.println("when i="+i+",ans="+ans);
//////////////////////////////////////////////////////
}


    System.out.println(ans);

    }
}
