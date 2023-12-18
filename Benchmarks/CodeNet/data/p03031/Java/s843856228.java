import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[][] a=new int[m][];
    for(int i=0;i<m;i++){
      int k=sc.nextInt();
      a[i]=new int[k];
      for(int j=0;j<k;j++){
        a[i][j]=sc.nextInt()-1;
      }
    }
    int[] p=new int[m];
    for(int i=0;i<m;i++){
      p[i]=sc.nextInt();
    }
    int ans=0;
    Deque<E> dq=new ArrayDeque<>();
    dq.add(new E(n));
    while(!dq.isEmpty()){
      E here=dq.pollFirst();
      if(here.fixed<n){
        dq.add(here.nT());
        dq.add(here.nF());
        continue;
      }
//      System.err.println(Arrays.toString(here.sw));
      boolean flag=true;
      for(int i=0;i<m;i++){
        int cnt=0;
        for(int j=0;j<a[i].length;j++){
          cnt+=here.sw[a[i][j]]?1:0;
        }
        if((cnt&1)!=p[i]){
          flag=false;
          break;
        }
      }
      if(flag){
        ans++;
      }
    }
    System.out.println(ans);
  }
  static class E{
    boolean[] sw;
    int fixed=0;
    E(int n){
      sw=new boolean[n];
    }
    E nT(){
      E res=new E(sw.length);
      for(int i=0;i<fixed;i++){
        res.sw[i]=sw[i];
      }
      res.sw[fixed]=true;
      res.fixed=fixed+1;
      return res;
    }
    E nF(){
      E res=new E(sw.length);
      for(int i=0;i<fixed;i++){
        res.sw[i]=sw[i];
      }
      res.fixed=fixed+1;
      return res;
    }
  }
}