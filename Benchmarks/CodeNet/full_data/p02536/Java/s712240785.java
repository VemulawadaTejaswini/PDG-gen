
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Main{

static int mod=(int)1e9+7;
 public static void main(String[] $) {

   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int m=sc.nextInt();
   ArrayList<ArrayList<Integer>> a=new ArrayList<>();
   for(int i=0;i<n;i++) {
     a.add(new ArrayList<>());
   }
   for(int i=0;i<m;i++) {
     int x=sc.nextInt()-1;
     int y=sc.nextInt()-1;
     a.get(y).add(x);
     a.get(x).add(y);
   }
   boolean vis[]=new boolean[n];
   int count=0;
   for(int i=0;i<n;i++) {
     if(vis[i]==false) {
       if(i!=0) {
         count++;
       }
       dfs(a,i,vis);
     }
   }
   System.out.println(count);
}
static int msb(int a){
   int k=(int)(Math.log(a)/Math.log(2));
   return k;
}
static void dfs(ArrayList<ArrayList<Integer>> aa,int src,boolean vis[]) {
  vis[src]=true;
  for(int i:aa.get(src)) {
    if(vis[i]==false) {
      dfs(aa,i,vis);
    }
  }
}

static long pow(long x,long y) {
  long res=1l;
  while(y!=0) {
    if(y%2==1) {
      res=x*res%mod;
    }
    y/=2;
    x=x*x%mod;
  }
  return res;
}

}
class pair{
  int x,y;
  pair(int x,int y){
    this.x=x;
    this.y=y;
  }
}