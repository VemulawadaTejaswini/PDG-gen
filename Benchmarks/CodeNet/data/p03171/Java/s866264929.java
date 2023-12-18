import java.util.*;
class Main{
  static Integer[][]cache;
  public static void Main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int []x=new int[n];
    cache=new Integer[n][n];
    for(int i=0;i<n;i++) x[i]=sc.nextInt();
    int total=0;
    for(int t:x) total+=t;
    System.out.println(dfs(x,true,0,x.length-1)>total/2);
  }
  public static int dfs(int []x,boolean t,int start,int end){
    if(start>end) return 0;
    if(t){
      int f=x[start]+dfs(x,!t,start+1,end);
      int e=x[end]+dfs(x,!t,start,end-1);
      return cache[start][end]=Math.max(f,e);
    }
    else{
      int f=x[start]+dfs(x,!t,start+1,end);
      int e=x[end]+dfs(x,!t,start,end-1);
      return cache[start][end]=Math.min(f,e);
    }
  }
}