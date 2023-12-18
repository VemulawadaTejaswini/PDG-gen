import java.util.*;

class Main{
  static class Zip1{
    private Map<Integer,Integer> zip;
    private int[] unzip;
    Zip1(int[] gomi){
      zip=new HashMap<>();
      Arrays.sort(gomi);
      int zure=0;
      int mae=0;
      for(int i=0;i<gomi.length;i++){
        if(mae!=gomi[i]||i==0){
          zip.put(gomi[i],i-zure);
          mae=gomi[i];
        }else{
          zure++;
        }
      }
      unzip=new int[zip.size()];
      for(Map.Entry<Integer,Integer> me:zip.entrySet()){
        unzip[me.getValue()]=me.getKey();
      }
    }
    public int zip(int i){
      return zip.get(i);
    }
    public int unzip(int i){
      return unzip[i];
    }
    public int size(){
      return zip.size();
    }
    public String toString(){
      return zip.toString();
    }
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] x=new int[n];
    int[] t=new int[n];
    int[] gomi=new int[2*n];
    for(int i=0;i<n;i++){
      x[i]=sc.nextInt();
      t[i]=x[i]+sc.nextInt()-1;
      gomi[i]=x[i];
      gomi[i+n]=t[i];
    }
//    System.err.println(Arrays.toString(x));
//    System.err.println(Arrays.toString(t));
    Zip1 zip=new Zip1(gomi);
//    System.err.println(zip);
    XT[] macs=new XT[n];
    for(int i=0;i<n;i++){
      macs[i]=new XT(zip.zip(x[i]),zip.zip(t[i]));
    }
//    System.err.println(Arrays.toString(macs));
    
//    System.err.println("sorted");
    Arrays.sort(macs,(s1,s2)->Integer.compare(s1.x,s2.x));
//    System.err.println(Arrays.toString(macs));
    int[] field=new int[zip.size()];
    int[] prs=new int[n];
    Arrays.fill(field,-1);
    for(int i=0;i<n;i++){
      prs[i]=field[macs[i].x];
      for(int j=macs[i].x;j<=macs[i].t;j++){
        field[j]=i;
      }
    }
//    System.err.println("field");
//    System.err.println(Arrays.toString(field));
//    System.err.println("prs");
//    System.err.println(Arrays.toString(prs));
    long[] ptn=new long[n];
    long mod=998244353;
    long ans=1;
    Arrays.fill(ptn,1);
    for(int i=n-1;i>=0;i--){
      ptn[i]++;
      if(prs[i]==-1){
        ans=(ans*ptn[i])%mod;
      }else{
        ptn[prs[i]]=(ptn[prs[i]]*ptn[i])%mod;
      }
    }
//    System.err.println("ptn");
//    System.err.println(Arrays.toString(ptn));
    System.out.println(ans);
  }
  static class XT{
    int x;
    int t;
    XT(int x,int t){
      this.x=x;
      this.t=t;
    }
    public String toString(){
      return "["+String.valueOf(x)+","+String.valueOf(t)+"]";
    }
  }
}