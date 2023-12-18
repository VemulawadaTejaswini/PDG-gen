import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[]=new int[n];
    int lis[]=new int[n];
    ArrayList<ArrayList<Integer>> g = new ArrayList<ArrayList<Integer>>();
    int ans[]=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
      lis[i]=-1;
      g.add(new ArrayList<Integer>());
    }
    for(int i=0;i<n-1;i++){
      int v1=sc.nextInt(),v2=sc.nextInt();
      g.get(v1-1).add(v2-1);
      g.get(v2-1).add(v1-1);
    }

    dfs(g,0,-1,a,lis,ans);
    for(int i=0;i<n;i++){
      pl(ans[i]+"");
    }

  }

  public static void dfs(ArrayList<ArrayList<Integer>> g,int v,int pr,int[]a,int[]lis,int[]ans){
    int x[]=liss(a[v],lis);
    ans[v]=x[0]+1;
    for(int i:g.get(v)){
      if(i!=pr){
        dfs(g,i,v,a,lis,ans);
      }
    }
    lis[x[0]]=x[1];
  }

  public static int[] liss(int n,int[]lis){
    for(int i=0;i<lis.length;i++){
      if(lis[i]==-1||lis[i]>=n){
        int k=lis[i];
        lis[i]=n;
        return new int[]{i,k};
      }
    }
    return new int[]{-1};
  }

  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
}
