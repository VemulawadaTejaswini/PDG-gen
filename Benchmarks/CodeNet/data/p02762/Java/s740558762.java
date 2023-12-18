import  java.util.*;
class Main{
  static class UnFd{
    int n;
    int[] par;
    int[] siz;
    int forest;
    UnFd(int n){
      this.n=n;
      par=new int[n];
      siz=new int[n];
      for(int i=0;i<n;i++){
        par[i]=i;
        siz[i]=1;
      }
      forest=n;
    }
    int forest(){
      return forest;
    }
    boolean isRoot(int i){
      return i==par[i];
    }
    int rootOf(int i){
      if(isRoot(i)){
        return i;
      }
      return par[i]=rootOf(par[i]);
    }
    int sizeOf(int i){
      return siz[rootOf(i)];
    }
    boolean isSame(int i,int j){
      return rootOf(i)==rootOf(j);
    }
    void merge(int i,int j){
      i=rootOf(i);
      j=rootOf(j);
      if(i==j){
        return;
      }
      par[i]=j;
      siz[j]+=siz[i];
      forest--;
    }
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int k=sc.nextInt();
    int[] sub=new int[n];
    UnFd uf=new UnFd(n);
    for(int i=0;i<m;i++){
      int a=sc.nextInt()-1;
      int b=sc.nextInt()-1;
      uf.merge(a,b);
      sub[a]++;
      sub[b]++;
    }
    for(int i=0;i<k;i++){
      int c=sc.nextInt()-1;
      int d=sc.nextInt()-1;
      if(uf.isSame(c,d)){
        sub[c]++;
        sub[d]++;
      }
    }
    for(int i=0;i<n-1;i++){
      System.out.print((uf.sizeOf(i)-sub[i]-1)+" ");
    }
    System.out.println((uf.sizeOf(n-1)-sub[n-1]-1));
  }
}