import java.util.*;
class Main{
  static Integer[][]cache;
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int w=sc.nextInt();
    int []x=new int[n];
    int []v=new int[n];
    for(int i=0;i<n;i++){
      x[i]=sc.nextInt();
      v[i]=sc.nextInt();
    }
    cache=new Integer[n+1][w+1];
    System.out.println(dfs(x,v,w,0));
    
  }
  public static long dfs(int []x,int []v,int W,int index){
 
        if(index==x.length || W==0) return 0;
        if(cache[index][W]!=null)return cache[index][W];
        long include=0,exclude;
        if(x[index]<=W){
            include=v[index]+dfs(x,v,W-x[index],index+1);
            exclude=dfs(x,v,W,index+1);
        }
        else{
            exclude=dfs(x,v,W,index+1);
        }
        return cache[index][W]=Math.max(include,exclude);
    }
}