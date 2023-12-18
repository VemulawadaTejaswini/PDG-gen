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
    lis[0]=a[0];ans[0]=1;
    dfs(g,0,-1,a,lis,0,ans);
    for(int i=0;i<n;i++){
      pl(ans[i]+"");
    }

  }

  public static void dfs(ArrayList<ArrayList<Integer>> g,int v,int pr,int[]a,int[]lis,int lislen,int[]ans){
    int x[]=new int[2];
    if(v!=0){
      x=liss(a[v],lis,lislen);
      ans[v]=x[0]+1;
    }
    for(int i:g.get(v)){
      if(i!=pr){
        dfs(g,i,v,a,lis,ans[v]-1,ans);
      }
    }
    if(v!=0){
      lis[x[0]]=x[1];
    }
  }

  public static int[] liss(int n,int[]lis,int len){
    if(lis[len]<n){
      lis[len+1]=n;
      return new int[]{len+1,-1};
    }
    int min=0,max=len;
    int mid=0;
    while(min<max){
      mid =(min+max)/2;
      if(lis[mid]>n){
        max = mid-1;
      }else if(lis[mid]<n){
        min = mid+1;
      }else{
        return new int[]{mid,n};
      }
    }
    if(lis[mid]>n){
      int k=lis[mid];
      lis[mid]=n;
      return new int[]{mid,k};
    }else{
      int k=lis[mid+1];
      lis[mid+1]=n;
      return new int[]{mid+1,k};
    }
    //return new int[]{-1};
  }

  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
}
