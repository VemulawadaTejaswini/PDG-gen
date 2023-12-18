import java.util.*;

class Main{
  static int mod=1000000007;
  static Map<Integer,Integer> pFacMap(int x){
    Map<Integer,Integer> res=new HashMap<>();
    for(int i=2;i*i<=x;i++){
      if(x%i==0){
        int p=0;
        while(x%i==0){
          x/=i;
          p++;
        }
        res.put(i,p);
      }
    }
    if(x!=1){
      res.put(x,1);
    }
    return res;
  }
  static long repow(int b,int p){
    long res=1;
    long a=b;
    while(p>0){
      if((p&1)==1){
        res=(res*a)%mod;
      }
      p=p>>1;
      a=(a*a)%mod;
    }
    return res;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    M[] ma=new M[n];
    for(int i=0;i<n;i++){
      ma[i]=new M();
      ma[i].m=pFacMap(a[i]);
    }
//    System.err.println(Arrays.deepToString(ma));
    Map<Integer,Integer> mp=new HashMap<>();
    for(int i=0;i<n;i++){
      for(Map.Entry<Integer,Integer> me:ma[i].m.entrySet()){
        if(mp.getOrDefault(me.getKey(),0)<me.getValue()){
          mp.put(me.getKey(),me.getValue());
        }
      }
    }
//    System.err.println(mp);
    long[] inv=new long[1000001];
    inv[1]=1;
    for(int i=2;i<=1000000;i++){
      inv[i]=mod-inv[(int)(mod%i)]*(mod/i)%mod;
    }
//    System.err.println(Arrays.toString(inv));
    long flat=1;
    for(Map.Entry<Integer,Integer> me:mp.entrySet()){
      flat=(flat*repow(me.getKey(),me.getValue()))%mod;
    }
    long ans=0;
    for(int i=0;i<n;i++){
      long kk=(flat*inv[a[i]])%mod;
      ans=(ans+kk)%mod;
    }
    System.out.println(ans);
  }
  static class M{
    Map<Integer,Integer> m;
    public String toString(){
      return m.toString();
    }
  }
}